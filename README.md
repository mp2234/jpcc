# jpcc

## Simple breadcrumb component

### Usage:
* component is automatically included on every jpcc/components/structure/page 
* configure starting depth per-component via dialog(defaults to 3)
* exclude pages via Page Properties dialog's "Hide in Navigation" checkbox

### Potential improvements

* update the data modeling for the breadcrumb. In particular, new with 6.3, Adobe has released a breadcrumb component that leverages Sling Models, along with other(https://github.com/Adobe-Marketing-Cloud/aem-core-wcm-components)
* collect more requirements from the "client" i.e. what should the breadcrumb behavior for the current page be? For now it displays as a link to itself, but some sites like the <a> to be removed, others want the whole entry removed, etc. 
  
### Notes:
* developed on 6.1(I don't have a 6.0 jar), so no guarantee it will work on 6.0 though the technology used should be available in 6.0 as well
* unstyled
