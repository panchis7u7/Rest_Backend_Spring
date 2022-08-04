package com.test.api.repositories

import com.test.api.models.CiscoGraduate
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CiscoGraduateRepository: JpaRepository<CiscoGraduate, UUID> {}