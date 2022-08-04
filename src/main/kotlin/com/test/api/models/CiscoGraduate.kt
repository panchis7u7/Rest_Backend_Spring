package com.test.api.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="cisco_graduates")
data class CiscoGraduate(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id") @JsonProperty("id") val id: UUID,
    @JsonProperty("firstName") @Column(name = "firstName") val firstName: String,
    @JsonProperty("lastName") @Column(name = "lastName") val lastName: String,
    @JsonProperty("cecid") @Column(name = "cecid") val cecid: String,
    @JsonProperty("technology") @Column(name = "technology") val technology: String
) {}