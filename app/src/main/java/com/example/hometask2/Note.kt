package com.example.hometask2

import java.io.Serializable

/**
 * Author: Dzhaparov Bekmamat
 */
class Note(
    var photoResource: String?,
    var title: String?,
    var description: String?,
    var date: String?
) : Serializable