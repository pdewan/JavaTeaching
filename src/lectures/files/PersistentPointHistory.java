package lectures.files;

import lectures.arrays.collections_kinds.PointHistory;

public interface PersistentPointHistory extends PointHistory {
	public void load();
	public void loadText();
	public void save();
	public void saveText();
}
