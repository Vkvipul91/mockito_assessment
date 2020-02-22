package com.example.todo.business;

import org.junit.Test;

import com.example.todo.api.TodoService;
import com.example.todo.api.TodoServiceStub;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class TodoBusinessImplStubTest {
	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, todos.size());
	}
}
