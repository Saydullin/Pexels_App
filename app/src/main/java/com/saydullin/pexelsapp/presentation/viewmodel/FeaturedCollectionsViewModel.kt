package com.saydullin.pexelsapp.presentation.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saydullin.pexelsapp.domain.mapper.collectionFeatured.CollectionFeaturedMapper
import com.saydullin.pexelsapp.domain.usecase.GetFeaturedCollectionsAPIUseCase
import com.saydullin.pexelsapp.domain.utils.Resource
import com.saydullin.pexelsapp.domain.utils.StatusType
import com.saydullin.pexelsapp.presentation.models.CollectionFeaturedItemUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeaturedCollectionsViewModel @Inject constructor(
    private val getFeaturedCollectionsAPIUseCase: GetFeaturedCollectionsAPIUseCase,
    private val collectionFeaturedMapper: CollectionFeaturedMapper,
): ViewModel() {

    private val _statusType = mutableStateOf<StatusType?>(null)
    private val _collectionFeatured = mutableStateOf<List<CollectionFeaturedItemUI>?>(null)
    val collectionFeatured: State<List<CollectionFeaturedItemUI>?> = _collectionFeatured
    val statusType = _statusType

    fun execute() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val collection = getFeaturedCollectionsAPIUseCase.execute()
                if (collection is Resource.Success) {
                    if (collection.data != null) {
                        val collectionMapped = collectionFeaturedMapper.map(collection.data)
                        _collectionFeatured.value = collectionMapped.collections
                    }
                } else {
                    _statusType.value = collection.statusType
                }
            } catch (e: Exception) {
                Log.e("sady", "error here")
                e.printStackTrace()
                _statusType.value = StatusType.DATA_ERROR
            }
        }
    }

}


