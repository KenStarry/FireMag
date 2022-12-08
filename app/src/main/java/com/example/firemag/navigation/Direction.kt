package com.example.firemag.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun NavDirection(
    navHostController: NavHostController
) {

    //  navigate to home screen
    val navigateToHomeScreen: () -> Unit = {
        navHostController.navigate(Screen.MainScreen.route)
    }

    //  navigate to auth screen
    val navigateToAuthScreen: () -> Unit = {
        navHostController.popBackStack()
        navHostController.navigate(Screen.AuthScreen.route)
    }

    //  navigate to product search screen
    val navigateToProductSearchScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductSearchScreen.route)
    }

    //  navigate to shopping cart screen
    val navigateToShoppingCartScreen: () -> Unit = {
        navHostController.navigate(Screen.ShoppingCartScreen.route)
    }

    //  navigate to thank you screen
    val navigateToThankYouScreen: () -> Unit = {
        navHostController.navigate(Screen.ThankYouScreen.route)
    }

    //  navigate back to main screen
    val navigateBackToMainScreen: () -> Unit = {
        navHostController.navigate(Screen.MainScreen.route) {
            popUpTo(Screen.MainScreen.route) {
                inclusive = true
            }
        }
    }

    //  navigate to brand products screen
    val navigateToBrandProductsScreen: () -> Unit = {
        navHostController.navigate(Screen.BrandProductsScreen.route)
    }

    //  navigate to products order screen
    val navigateToProductsOrderScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductsOrderScreen.route)
    }

    //  navigate to product details screen
    val navigateToProductDetailsScreen: () -> Unit = {
        navHostController.navigate(Screen.ProductDetailsScreen.route)
    }

    //  navigate to home screen
    val navigateBack: () -> Unit = {
        navHostController.navigateUp()
    }

}
























