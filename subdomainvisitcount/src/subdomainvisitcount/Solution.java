package subdomainvisitcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String args[]) {
		  String[] cpDomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		  Map<String, Integer> domainCount = new HashMap<>();
		  
		  for (String s : cpDomains) {
			  String[] subdomain = s.split(" ");
			  Integer count = Integer.valueOf(subdomain[0]);			  
			  do {
				  String url = subdomain[1];
				  if (domainCount.containsKey(url)) {
					  domainCount.put(url,domainCount.get(url) + count);
				  } else {
					  domainCount.put(url,count);
				  }
				  subdomain = url.split("^(\\w+)\\.");
			  }	while (subdomain.length != 1);		  
		  }
		  
		  Set<String> domains = domainCount.keySet();
		  for (String domain : domains) {
			  System.out.println(domain + " " + domainCount.get(domain));
		  }
	}
}
