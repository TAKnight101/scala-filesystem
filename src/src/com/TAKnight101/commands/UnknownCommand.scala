package com.TAKnight101.commands

import com.TAKnight101.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Command not found!")

}
