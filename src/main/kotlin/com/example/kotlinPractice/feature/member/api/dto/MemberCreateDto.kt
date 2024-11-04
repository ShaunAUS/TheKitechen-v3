package com.example.kotlinPractice.feature.member.api.dto

import com.example.kotlinPractice.domain.enums.LevelType
import com.example.kotlinPractice.domain.enums.SectionType

data class MemberCreateDto(
    val name: String,
    val level: LevelType,
    val section: SectionType,
    val experience: Int,
    val kitchenId: Long,
)
