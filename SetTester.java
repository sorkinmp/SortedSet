import static org.junit.Assert.*;

import org.junit.Test;

public class SetTester {

	@Test
	public void testGetCurrentSize() {
		SortedSet s = new SortedSet();
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		assertEquals(5,s.getCurrentSize());
	}

	@Test
	public void testIsEmpty() {
		// create a set
		SortedSet s = new SortedSet();
		assertTrue(s.isEmpty());
		s.add("Blank");
		assertFalse(s.isEmpty());
	}

	@Test
	public void testAdd() {
		SortedSet s = new SortedSet();
		// add items and check size
		s.add("Hello");
		assertEquals(1,s.getCurrentSize());
		assertTrue(s.contains("Hello"));
		s.add("A");
		assertTrue(s.toArray()[0].equals("A"));
		assertTrue(s.toArray()[1].equals("Hello"));
		s.clear();
		s.add("A");
		s.add("Hello");
		assertTrue(s.toArray()[0].equals("A"));
		assertTrue(s.toArray()[1].equals("Hello"));
		s.add("B");
		assertTrue(s.toArray()[0].equals("A"));
		assertTrue(s.toArray()[1].equals("B"));
		assertTrue(s.toArray()[2].equals("Hello"));
	}

	@Test
	public void testRemoveString() {
		SortedSet s = new SortedSet();
		// add items to set
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		// remove items, check size and contains
		s.remove("cat");
		assertFalse(s.contains("cat"));
		assertEquals(4,s.getCurrentSize());
		s.remove("apple");
		assertFalse(s.contains("apple"));
		assertEquals(3,s.getCurrentSize());
		s.remove("elephant");
		assertFalse(s.contains("elephant"));
		assertEquals(2,s.getCurrentSize());
		s.remove("bubble");
		assertFalse(s.contains("bubble"));
		assertEquals(1,s.getCurrentSize());
		s.remove("dog");
		assertFalse(s.contains("dog"));
		assertEquals(0,s.getCurrentSize());
	}

	@Test
	public void testRemove() {
		SortedSet s = new SortedSet();
		// add items to set
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		// remove one by one and check size
		for(int i = 0; i < 5; i++) {
			s.remove();
			assertEquals(4 - i,s.getCurrentSize());
		}
	}

	@Test
	public void testRemoveLast() {
		SortedSet s = new SortedSet();
		// add items to set
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		// remove last item, check contains and size
		s.removeLast();
		assertFalse(s.contains("elephant"));
		assertEquals(4 ,s.getCurrentSize());
		s.removeLast();
		assertFalse(s.contains("dog"));
		assertEquals(3 ,s.getCurrentSize());
		s.removeLast();
		assertFalse(s.contains("cat"));
		assertEquals(2 ,s.getCurrentSize());
		s.removeLast();
		assertFalse(s.contains("bubble"));
		assertEquals(1 ,s.getCurrentSize());
		s.removeLast();
		assertFalse(s.contains("apple"));
		assertEquals(0 ,s.getCurrentSize());
	}

	@Test
	public void testClear() {
		SortedSet s = new SortedSet();
		// add items to set
		s.add("Hello");
		s.add("Darkness");
		s.add("My");
		s.add("Old");
		s.add("Friend");
		// clear set and check size
		s.clear();
		assertEquals(0,s.getCurrentSize());
		assertTrue(s.toArray().length == 0);
	}

	@Test
	public void testContains() {
		SortedSet s = new SortedSet();
		// add items, check if contained in set
		s.add("apple");
		assertTrue(s.contains("apple"));
		s.add("dog");
		assertTrue(s.contains("dog"));
		s.add("elephant");
		assertTrue(s.contains("elephant"));
		s.add("bubble");
		assertTrue(s.contains("bubble"));
		s.add("cat");
		assertTrue(s.contains("cat"));
	}

	@Test
	public void testToString() {
		SortedSet s = new SortedSet();
		// add items to set, check toString matches
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		assertEquals(s.toString(),"[ apple bubble cat dog elephant ]");
	}

	@Test
	public void testToArray() {
		SortedSet s = new SortedSet();
		// add items to set
		s.add("apple");
		s.add("dog");
		s.add("elephant");
		s.add("bubble");
		s.add("cat");
		// check that items correspond correctly in toArray
		assertEquals("apple",s.toArray()[0]);
		assertEquals("bubble",s.toArray()[1]);
		assertEquals("cat",s.toArray()[2]);
		assertEquals("dog",s.toArray()[3]);
		assertEquals("elephant",s.toArray()[4]);
	}

}
