package com.intellisoft.internationalinstance

import com.fasterxml.jackson.annotation.JsonProperty

data class Results(val code: Int, val details: Any?)

data class DbResults(
    val count: Int,
    val details: Any
)

data class DbError(val details: Any?)

data class DbProgramsList(
    @JsonProperty("programs")
    val programs: List<DbPrograms>
)
data class DbPrograms(
    @JsonProperty("id")
    val id: String,
    @JsonProperty("created")
    val created: String,
    @JsonProperty("name")
    val name: String,
)
