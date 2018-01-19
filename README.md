# jpcc

## Simple breadcrumb component

### Installation:
* Installing the package via package manager. It includes:
  * Breadcrumb component and a page component
  * OSGi bundle that should automatically install
  * Sample content to demo the breadcrumb

### Usage:
* component is automatically included on every jpcc/components/structure/page 
* configure starting depth per-component via dialog(defaults to 3)
* exclude pages via Page Properties dialog's "Hide in Navigation" checkbox

### Potential improvements

* update the data modeling for the breadcrumb. In particular, new with 6.3, Adobe has released a breadcrumb component that leverages Sling Models, along with other(https://github.com/Adobe-Marketing-Cloud/aem-core-wcm-components)
* collect more requirements from the "client" i.e. what should the breadcrumb behavior for the current page be? For now it displays as a link to itself, but some sites like the <a> to be removed, others want the whole entry removed, etc. 
  
### Troubleshooting: 
* if the bundle doesn't automatically install with the package, either:
  * extract the `.jar` from the package and try installing manually through Felix
  * if not, restarting the instance may help

### Notes:
* developed on 6.1(I don't have a 6.0 jar), so no guarantee it will work on 6.0 though the technology used should be available in 6.0 as well
* component is unstyled
* included in this repo is the source code for the Breadcrumb useapi class(along with other classes from the archetype). The breadcrumb class is [here](https://github.com/mp2234/jpcc/blob/master/core/src/main/java/jpcc/core/use/BreadcrumbUse.java)


### Requirement:
Adobe Experience Manager – Software Engineer Code Challenge

Please send back via GitHub 

OBJECTIVE: Create a breadcrumbs component which is compatible with AEM 6.0 or higher. The deliverable should be an AEM package.
ACCEPTANCE CRITERIA:
As a Content Author: I want to be able to exclude pages from the breadcrumb listing so that structural pages or pages not meant to be navigated to directly are not presented in this context.
As a Site User: I want to be able to see where I am in the site’s content tree so that I understand the context of what I am viewing. I want to be able to navigate to where I have come from in the site so that I can easily jump back and forth between site sections.
HOW TO SUBMIT: Send an email to our recruiters with a link to a public code repository or download location that can be shared with the public. You are free to post updates to your solution. You should not spend more than 2 hours on this code challenge. We are looking for a solid understanding of developing on AEM, in addition to a description of what can be done to improve your solution if given more time.
