package com.fredericoferreiracosta.businessinteraction.businessinteraction;

/**
 * Business interaction service.
 * <p>
 * Represents a communication from an external system with our system.
 * The external system will get something done in the system.
 */
public interface BusinessInteraction {

    /**
     * Will execute something and return a {@link Response}.
     *
     * @return
     */
    Response execute();
}
