package com.habit.tracker.domain.usecase

import com.habit.tracker.domain.repository.RequestRepository
import javax.inject.Inject

class CreateRequestUseCase @Inject constructor(private val repository: RequestRepository) {

    suspend operator fun invoke(title: String, description: String, photos: List<String>) =
        repository.createRequest(title, description, photos)
}