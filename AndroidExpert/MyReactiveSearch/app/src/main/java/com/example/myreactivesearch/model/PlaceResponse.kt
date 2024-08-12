package com.example.myreactivesearch.model

import com.google.gson.annotations.SerializedName

class PlaceResponse (
    @field:SerializedName("features")
    val features : List<PlacesItem>
)