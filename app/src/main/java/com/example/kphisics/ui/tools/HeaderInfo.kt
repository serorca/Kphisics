package com.example.kphisics.ui.tools

import java.util.ArrayList

class HeaderInfo {
    private var name: String? = null
    private var productList = ArrayList<DetailInfo>()

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getProductList(): ArrayList<DetailInfo> {
        return productList
    }

    fun setProductList(productList: ArrayList<DetailInfo>) {
        this.productList = productList
    }
}