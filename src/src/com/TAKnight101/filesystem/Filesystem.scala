package com.TAKnight101.filesystem

import com.TAKnight101.commands.Command
import com.TAKnight101.files.Directory

import java.util.Scanner

object Filesystem extends App {


  val scanner = new Scanner(System.in)

  val root = Directory.ROOT
  var state = State(root , root)


  while(true){
   state.show
    val input = scanner.nextLine()
    state = Command.form(input).apply(state)
  }

}
