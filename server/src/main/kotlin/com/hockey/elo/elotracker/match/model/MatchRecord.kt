package com.hockey.elo.elotracker.match.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class MatchRecord(
    @Id @GeneratedValue
    var id: Long,
    var playerOneId: Long,
    var playerTwoId: Long,
    var playerOneScore: Int = 0,
    var playerTwoScore: Int = 0,
    var winner: Long
) {
    constructor() : this (0L, 0L, 0L, 0, 0, 0L)
}