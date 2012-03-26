package mspace.controller;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodolistControllerTest {
    @Test
    public void testList() throws Exception {

    }

    @Test
    public void testCreate() throws Exception {

    }

    @Test
    public void shouldSaveStateInTodoRepo() {
        StubTodoRepo tdRepo = mock(StubTodoRepo.class);
        when(tdRepo.save("Thing")).equals(true);
        TodolistController tdlist = new TodolistController(tdRepo);

        tdlist.save();
    }
}
