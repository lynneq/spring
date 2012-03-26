package mspace.controller;

import mspace.domain.db.ITodoRepo;

public class StubTodoRepo implements ITodoRepo {
    public boolean save(String item){
      return true;
    }
}
