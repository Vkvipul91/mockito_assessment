package com.example.todo.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.todo.api.TodoService;

public class TestTodoBusinessImpl {

	@Test
	public void testTodoBusinessImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetrieveTodosRelatedToSpringUsingMock() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoService.retrieveTodos("dummy")).thenReturn(allTodos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_UsingBDD() {
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> allTodos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");

		//given
		given(todoService.retrieveTodos("Spring")).willReturn(allTodos);

		//when
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Spring");

		//then
		assertThat(todos.size(), is(2));
	}

}
