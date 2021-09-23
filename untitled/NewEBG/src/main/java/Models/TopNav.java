package Models;

public enum TopNav {



    PRODUCT("Product"),
    HOW_EDDIE_WORKS("How Eddie"),
    REVIEWS("Reviews"),
    FAQS("FAQS");


    private final String top;

    /*constructor*/

    TopNav(String navTopMenu){
        this.top = navTopMenu;
    }


    /*Metodo getter*/
    public String getNavTopMenuOption()
    {
        return top;
    }

}
