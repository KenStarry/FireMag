package com.example.firemag.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.firemag.core.AppConstants
import com.example.firemag.presentation.auth.AuthScreen
import com.example.firemag.presentation.brand_products.BrandProductsScreen
import com.example.firemag.presentation.main.MainScreen
import com.example.firemag.presentation.product_details.ProductDetailsScreen
import com.example.firemag.presentation.product_search.ProductSearchScreen
import com.example.firemag.presentation.products_order.ProductsOrderScreen
import com.example.firemag.presentation.shopping_cart.ShoppingCartScreen
import com.example.firemag.presentation.thank_you.ThankYouScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost

@Composable
@ExperimentalComposeUiApi
@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@ExperimentalFoundationApi
fun NavGraph(
    navHostController: NavHostController
) {

    //  our navigation direction
    val direction = remember(navHostController) {
        Direction(navHostController)
    }

    AnimatedNavHost(
        navController = navHostController,
        startDestination = Screen.Auth.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {

        //  authentication screen
        composable(route = Screen.Auth.route) {
            AuthScreen()
        }

        //  main screen
        composable(route = Screen.Main.route) {
            MainScreen()
        }

        //  product search screen
        composable(route = Screen.ProductSearch.route) {
            ProductSearchScreen()
        }

        //  shopping cart screen
        composable(route = Screen.ShoppingCart.route) {
            ShoppingCartScreen()
        }

        //  thank you screen
        composable(route = Screen.ThankYou.route) {
            ThankYouScreen()
        }

        //  products order screen
        composable(
            route = "${Screen.ProductsOrder.route}/{${AppConstants.ORDER_ID}}",
            arguments = listOf(
                navArgument(AppConstants.ORDER_ID) {
                    type = NavType.StringType
                }
            )
        ) {
            ProductsOrderScreen()
        }

        //  Brand products screen
        composable(
            route = "${Screen.BrandProducts.route}/{${AppConstants.PRODUCT_BRAND}}",
            arguments = listOf(
                navArgument(AppConstants.PRODUCT_BRAND) {
                    type = NavType.StringType
                }
            )
        ) {
            BrandProductsScreen()
        }

        //  product details screen
        composable(
            route = "${Screen.ProductDetails.route}/{${AppConstants.PRODUCT_ID}}",
            arguments = listOf(
                navArgument(AppConstants.PRODUCT_ID) {
                    type = NavType.StringType
                }
            )
        ) {
            ProductDetailsScreen()
        }
    }

}

































