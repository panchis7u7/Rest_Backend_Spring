package com.test.api.services

import com.test.api.exceptions.BusinessException
import com.test.api.models.CiscoGraduate
import com.test.api.repositories.CiscoGraduateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CiscoGraduateServices : ICiscoGraduateService{

    @Autowired val ciscoGradsRepo: CiscoGraduateRepository? = null

    @Throws(BusinessException::class)
    override fun listAll(): List<CiscoGraduate> {
        try {
            return ciscoGradsRepo!!.findAll() as List<CiscoGraduate>
        } catch(e: Exception) {
            throw BusinessException(e.message!!)
        }
    }
}