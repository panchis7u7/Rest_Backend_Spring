package com.test.api.services

import com.test.api.models.CiscoGraduate

interface ICiscoGraduateService {
    fun listAll(): List<CiscoGraduate>
}