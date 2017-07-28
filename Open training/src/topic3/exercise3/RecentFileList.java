package topic3.exercise3;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList<recentInt> {

	private RecentFile recentFile;
	private List<RecentFile> list;

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

		if (this.list.isEmpty()) {
			this.list.add(file);
		} else {
			if (list.contains(file)) {
				list.remove(file);
			}
			if (list.size()==15) {
				list.remove(0);
			}
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
