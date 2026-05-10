package com.manabank.accesscontrol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManaAccountTest {

    @Test
    void shouldAllowAccessThroughPublicMethods() {
        ManaAccount manaAccount = new ManaAccount("MANA-001", 1000);
        manaAccount.deposit(500);

        assertEquals(1500, manaAccount.getBalance());
        assertEquals("MANA-001", manaAccount.getAccountId());
    }

    @Test
    void shouldNotAllowInvalidDeposits() {
        ManaAccount manaAccount = new ManaAccount("MANA-001", 1000);
        assertThrows(IllegalArgumentException.class, () -> manaAccount.deposit(0));
    }

}