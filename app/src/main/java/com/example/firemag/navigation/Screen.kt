package com.example.firemag.navigation

import com.example.firemag.core.AppConstants.AUTH_SCREEN
import com.example.firemag.core.AppConstants.BRAND_PRODUCTS_SCREEN
import com.example.firemag.core.AppConstants.MAIN_SCREEN
import com.example.firemag.core.AppConstants.PRODUCTS_ORDER_SCREEN
import com.example.firemag.core.AppConstants.PRODUCT_DETAILS_SCREEN
import com.example.firemag.core.AppConstants.PRODUCT_SEARCH_SCREEN
import com.example.firemag.core.AppConstants.SHOPPING_CART_SCREEN
import com.example.firemag.core.AppConstants.THANK_YOU_SCREEN

sealed class Screen(val route: String) {

    object Auth : Screen(AUTH_SCREEN)
    object Main : Screen(MAIN_SCREEN)
    object ProductSearch : Screen(PRODUCT_SEARCH_SCREEN)
    object ShoppingCart : Screen(SHOPPING_CART_SCREEN)
    object BrandProducts : Screen(BRAND_PRODUCTS_SCREEN)
    object ProductDetails : Screen(PRODUCT_DETAILS_SCREEN)
    object ProductsOrder : Screen(PRODUCTS_ORDER_SCREEN)
    object ThankYou : Screen(THANK_YOU_SCREEN)

}
