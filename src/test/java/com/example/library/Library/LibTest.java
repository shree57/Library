package com.example.library.Library;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.library.Library.Dao.LibDaoImpl;

@RunWith(MockitoJUnitRunner.class)
public class LibTest {


	@Mock
	LibDaoImpl libImpl;

	@Test
	public void test() {
		assertEquals("Blr", libImpl.findById((long) 1).get().getLocation());
	}

}