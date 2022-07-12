package com.example.davaleba_10

data class Product (
    val title:String,
    val image: Int,
    val price: Int,
    val category: List<Category>
        )


val productList = listOf(
    Product(
        "BLUE PARTY DRESS",
        R.drawable.party1,
        55,
        listOf(
            Category.ALL,
            Category.PARTY,
        )
        ),

      Product(
          "BLACK PATY DRESS",
          R.drawable.party2,
          40,
          listOf(
              Category.PARTY,
              Category.ALL,
          )
      ),

     Product(
          "GREEN PARTY DRESS",
         R.drawable.party3,
         38,
         listOf(
             Category.ALL,
             Category.PARTY,
         )
     ),

    Product(
        "gray Tshirt",
        R.drawable.camp1,
        20,
        listOf(
            Category.ALL,
            Category.CAMPING,
        )
    ),

    Product(
        "BLACK COMBO",
        R.drawable.camp2,
        80,
        listOf(
            Category.ALL,
            Category.CAMPING,
        )
    ),
    Product(
        "GRAY COMBO",
        R.drawable.camp3,
        38,
        listOf(
            Category.ALL,
            Category.CAMPING,
        )
    ),


    Product(
        "PINK WHITNEY",
        R.drawable.drink1,
        25,
        listOf(
            Category.ALL,
            Category.DRINKS,
        )
    ),

    Product(
        "HEINEKEN",
        R.drawable.drink2,
        15,
        listOf(
            Category.ALL,
            Category.DRINKS,
        )
    ),

    Product(
        "ALAZANI WINE",
        R.drawable.drinkk3,
        45,
        listOf(
            Category.ALL,
            Category.DRINKS,
        )
    ),

    Product(
        "WHITE PALACE BURGER",
        R.drawable.burger,
        10,
        listOf(
            Category.ALL,
            Category.FOOD,
        )
    ),

    Product(
        "ITALIAN PASTA",
        R.drawable.pasta,
        20,
        listOf(
            Category.ALL,
            Category.FOOD,
        )
    ),

    Product(
        "GEORGIAN BEENS",
        R.drawable.lobio,
        20,
        listOf(
            Category.ALL,
            Category.FOOD,
        )
    ),


    Product(
        "HARRY POTTER AND A PHILOSOPHY STONE",
        R.drawable.book1,
        5,
        listOf(
            Category.ALL,
            Category.BOOKS,
        )
    ),

    Product(
        "HARRY POTTER AND THE SECRET STONE",
        R.drawable.book2,
        5,
        listOf(
            Category.ALL,
            Category.BOOKS,
        )
    ),
    Product(
        "HARRY POTTER AND THE DEATHLY HALLOWS ",
        R.drawable.book3,
        5,
        listOf(
            Category.ALL,
            Category.BOOKS,
        )
    ),


)


val selectedItmes = mutableListOf<Product>()