package com.here.bom

import com.fasterxml.jackson.databind.ObjectMapper

object Demo extends App {
  val mapper = new ObjectMapper()
  println("!!! It is works !!!")
  println("ObjectMapper instance: " + mapper)
}