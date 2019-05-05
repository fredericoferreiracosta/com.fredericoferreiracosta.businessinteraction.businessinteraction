package com.fredericoferreiracosta.businessinteraction.businessinteraction;

/**
 * Use example.
 */
public class Runner {

    public static void main(String[] args) {
        BusinessInteractionFactory myBiFactory = new BusinessInteractionFactory();
        BusinessInteraction bi = myBiFactory.getBusinessInteractionStrategy("CustomerInsert");
        Response response = bi.execute();
        System.out.println(response.toString());
    }
}
