package jpcc.core.use;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;

public class BreadcrumbUse extends WCMUse {
	protected final static Logger log = LoggerFactory.getLogger(BreadcrumbUse.class);
	
	private String PN_START_LEVEL = "startLevel";
	
	private Deque<Page> pages;
	
	public void activate() {
		
		pages = new ArrayDeque<Page>();
		
		int startLevel = getProperties().get(PN_START_LEVEL, 3);
		Page current = getCurrentPage();
		
		while(current.getDepth() >= startLevel) {
			if(!current.getProperties().get("hideInNav", false)) {
				pages.push(current);
			}
			current = current.getParent();
		}
		
	}
	
	public Collection<Page> getPages() {
		return pages;
	}

}
