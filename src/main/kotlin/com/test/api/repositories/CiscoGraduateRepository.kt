package com.test.api.repositories

import com.test.api.models.CiscoGraduate
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CiscoGraduateRepository: CrudRepository<CiscoGraduate, UUID> {}