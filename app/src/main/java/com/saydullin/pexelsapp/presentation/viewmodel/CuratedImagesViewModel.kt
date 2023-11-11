package com.saydullin.pexelsapp.presentation.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saydullin.pexelsapp.domain.mapper.curatedImages.CuratedImagesMapper
import com.saydullin.pexelsapp.domain.usecase.GetCuratedImagesAPIUseCase
import com.saydullin.pexelsapp.domain.utils.Resource
import com.saydullin.pexelsapp.domain.utils.StatusType
import com.saydullin.pexelsapp.presentation.models.CuratedImagesItemUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CuratedImagesViewModel @Inject constructor(
    private val getCuratedImagesAPIUseCase: GetCuratedImagesAPIUseCase,
    private val curatedImagesMapper: CuratedImagesMapper,
): ViewModel() {

    private val _statusType = mutableStateOf<StatusType?>(null)
    private val _curatedImages = mutableStateOf<List<CuratedImagesItemUI>?>(null)
    val curatedImages: State<List<CuratedImagesItemUI>?> = _curatedImages
    val statusType = _statusType

    fun execute() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val images = getCuratedImagesAPIUseCase.execute()
                if (images is Resource.Success) {
                    if (images.data != null) {
                        val collectionMapped = curatedImagesMapper.map(images.data)
                        _curatedImages.value = collectionMapped.photos
                    }
                } else {
                    _statusType.value = images.statusType
                }
            } catch (e: Exception) {
                Log.e("sady", "error curatedIMagesVM")
                e.printStackTrace()
                _statusType.value = StatusType.DATA_ERROR
            }
        }
    }

}


