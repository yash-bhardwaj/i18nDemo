package com.knoldus.i18n.Demo

import java.util.{Locale, ResourceBundle}


object I18Tester extends App {

  lazy val bundle = ResourceBundle.getBundle("CodeSquad", locale)
  val lang = "en"
  val country = "IN"
  val locale = new Locale(lang, country)

  for(i <- 0 to 10){
     println(bundle.getString("invalid_registration_key_or_module"))
    Thread.sleep(2000)
  }
}
