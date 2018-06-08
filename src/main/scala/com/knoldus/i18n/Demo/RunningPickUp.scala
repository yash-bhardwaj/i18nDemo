package com.knoldus.i18n.Demo

import java.util.{Locale, ResourceBundle}

import com.knoldus.i18n.Demo.I18Tester.locale

import scala.io.StdIn.readInt

object RunningPickUp {
  def runApp: Boolean = {
    runApplication("", true)
  }
  lazy val bundle = ResourceBundle.getBundle("CodeSquad", locale)
  val lang = "en"
  val country = "IN"
  val locale = new Locale(lang, country)
  private def runApplication(initialValue: String, flag: Boolean): Boolean = {
    if (flag) {
      println("Hi there! welcome to I18N demo\n")
      println(s"this is the latest value for invalid_registration_key_or_module : ${bundle.getString("invalid_registration_key_or_module")}")
      println("\nPress 1 to pick up the updated value\n")
      println("\nPress 2 exit the app\n")
      println("\n")
      val choice = readInt()
      choice match {
        case x if x == 1 => runApplication(bundle.getString("invalid_registration_key_or_module"), true)
        case x if x == 2 => runApplication("", false)
      }
    } else {
      false
    }
  }
}

