package com.TAKnight101.commands

import com.TAKnight101.filesystem.State

trait Command {


   def apply(state: State): State = state



}

object  Command {

  def form(input : String) : Command = new UnknownCommand
}
