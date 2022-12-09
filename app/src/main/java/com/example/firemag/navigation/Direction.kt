package com.example.firemag.navigation

import androidx.navigation.NavHostController

class Direction(
    navHostController: NavHostController
) {

    //  navigate to home screen
    val navigateToHomeScreen: () -> Unit = {
        navHostController.navigate(Screen.Main.route)
    }

    //  navigate to auth screen
    val navigateToAuthScreen: () -> Unit = {
        navHostController.popBackStack()
        navHostController.navigate(Screen.Auth.route)
    }

    //  navigate to product search screen
    val navigateToProductSearchScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductSearch.route)
    }

    //  navigate to shopping cart screen
    val navigateToShoppingCartScreen: () -> Unit = {
        navHostController.navigate(Screen.ShoppingCart.route)
    }

    //  navigate to thank you screen
    val navigateToThankYouScreen: () -> Unit = {
        navHostController.navigate(Screen.ThankYou.route)
    }

    //  navigate back to main screen
    val navigateBackToMainScreen: () -> Unit = {
        navHostController.navigate(Screen.Main.route) {
            popUpTo(Screen.Main.route) {
                inclusive = true
            }
        }
    }

    //  navigate to brand products screen
    val navigateToBrandProductsScreen: () -> Unit = {
        navHostController.navigate(Screen.BrandProducts.route)
    }

    //  navigate to products order screen
    val navigateToProductsOrderScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductsOrder.route)
    }

    //  navigate to product details screen
    val navigateToProductDetailsScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductDetails.route)
    }

    //  navigate to home screen
    val navigateBack: () -> Unit = {
        navHostController.navigateUp()
    }

}
























