package like_dislike_count;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "clickCounterBean")
@SessionScoped
public class ClickCounterBean {
	private int likeCount = 0;
	private int dislikeCount =0;
	public int getLikeCount() {
		return likeCount;
	}
	public int getDislikeCount() {
		return dislikeCount;
	}
	
	public void incrementLike() {
		likeCount ++;
	}
	public void incrementDislike() {
		dislikeCount++;
	}
}
