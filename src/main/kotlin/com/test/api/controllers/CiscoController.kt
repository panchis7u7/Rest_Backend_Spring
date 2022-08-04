package com.test.api.controllers

import com.test.api.models.CiscoGraduate
import com.test.api.services.CiscoGraduateServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cisco/")
class CiscoController {

    @Autowired val ciscoGradsService: CiscoGraduateServices? = null

    @GetMapping("/grads")
    fun getGrads(): ResponseEntity<List<CiscoGraduate>> = ResponseEntity(ciscoGradsService!!.listAll(), HttpStatus.OK)
}