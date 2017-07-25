package topic3.exercise3;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList<recentInt> {

	private RecentFile recentFile;
	private ArrayList<RecentFile> list;

	public RecentFileList() {
		list = new ArrayList<RecentFile>(15);
	}

	public RecentFile getLastItem() {
		if (recentFile == null) {
			return null;
		} else {
			return list.get(list.size() - 1);

		}
	}

	public void setLastFileInList(RecentFile file) {

		if (this.list.isEmpty() == false) {
			this.list.add(file);
		} else {
			this.list.add(file);
		}

	}

	public void open(RecentFile file) {
		this.recentFile = file;
		this.setLastFileInList(file);
	}

	public Object getList() {
		return this.list;
	}
}
