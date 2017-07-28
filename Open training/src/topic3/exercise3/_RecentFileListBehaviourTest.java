package topic3.exercise3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _RecentFileListBehaviourTest {

	@Test
	public void firstRunTest() {

		RecentFileList recentFile = new RecentFileList();
		assertEquals(null, recentFile.getLastItem());
	}

	@Test
	public void secondRunTest() {

		RecentFileList recentFile = new RecentFileList();
		RecentFile file = new RecentFile(1);
		recentFile.open(file);
		assertEquals(file.getData(), recentFile.getLastItem().getData());
	}

	@Test
	public void twoOpenedFilesTest() {

		RecentFileList recentFile = new RecentFileList();
		RecentFile file = new RecentFile(1);
		recentFile.open(file);
		RecentFile file2 = new RecentFile(2);
		recentFile.open(file2);
		assertEquals(file2.getData(), recentFile.getLastItem().getData());
	}

	@Test
	public void openingLotsOfFilesTest() {

		RecentFileList recentFile = new RecentFileList();

		RecentFile file = new RecentFile(1);
		recentFile.open(file);
		RecentFile file2 = new RecentFile(2);
		recentFile.open(file2);
		RecentFile file3 = new RecentFile(3);
		recentFile.open(file3);
		RecentFile file4 = new RecentFile(4);
		recentFile.open(file4);
		RecentFile file5 = new RecentFile(5);
		recentFile.open(file5);
		RecentFile file6 = new RecentFile(6);
		recentFile.open(file6);
		RecentFile file7 = new RecentFile(7);
		recentFile.open(file7);
		assertEquals(file7.getData(), recentFile.getLastItem().getData());
	}

	@Test
	public void openingSameFilesTest() {

		RecentFileList recentFile = new RecentFileList();

		RecentFile file = new RecentFile(1);
		recentFile.open(file);
		RecentFile file2 = new RecentFile(2);
		recentFile.open(file2);
		RecentFile file3 = new RecentFile(3);
		recentFile.open(file3);
		RecentFile file4 = new RecentFile(4);
		recentFile.open(file4);
		RecentFile file5 = new RecentFile(5);
		recentFile.open(file5);
		RecentFile file6 = new RecentFile(6);
		recentFile.open(file6);
		RecentFile file7 = new RecentFile(7);
		recentFile.open(file7);
		recentFile.open(file);
		recentFile.open(file3);
		recentFile.open(file4);
		assertEquals(file4.getData(), recentFile.getLastItem().getData());
	}
	@Test
	
	public void viewListOfFilesOpenedTest() {

		RecentFileList recentFile = new RecentFileList();
		List<RecentFile> list = new ArrayList<RecentFile>();
		
		RecentFile file = new RecentFile(1);
		recentFile.open(file);
		list.add(file);
		RecentFile file2 = new RecentFile(2);
		recentFile.open(file2);
		list.add(file2);
		RecentFile file3 = new RecentFile(3);
		recentFile.open(file3);
		list.add(file3);
		RecentFile file4 = new RecentFile(4);
		recentFile.open(file4);
		list.add(file4);
		RecentFile file5 = new RecentFile(5);
		recentFile.open(file5);
		list.add(file5);
		RecentFile file6 = new RecentFile(6);
		recentFile.open(file6);
		list.add(file6);
		RecentFile file7 = new RecentFile(7);
		recentFile.open(file7);
		list.add(file7);
		recentFile.open(file);
		list.remove(file);
		list.add(file);
		recentFile.open(file3);
		list.remove(file3);
		list.add(file3);
		recentFile.open(file4);
		list.remove(file4);
		list.add(file4);
		assertEquals(list.get(0).getData(), ((List<RecentFile>) recentFile.getList()).get(0).getData());
	}
	

}
