/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.gen.api;

import java.util.UUID;

import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.client.gen.model.Account;
import org.killbill.billing.util.api.AuditLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * API tests for AccountApi
 */
public class AccountApiTest {



    private final static String SERVER_HOST = "127.0.0.1";
    private final static int SERVER_PORT = 8080;

    private AccountApi api;

    private RequestOptions requestOptions;

    @BeforeClass
    public void setup() {
        final KillBillHttpClient httpClient = new KillBillHttpClient(String.format("http://%s:%d", SERVER_HOST, SERVER_PORT),
                                                                     "admin",
                                                                     "password",
                                                                     "bob",
                                                                     "lazar",
                                                                     null,
                                                                     null,
                                                                     3 * 1000,
                                                                     1 * 1000,
                                                                     5 * 1000);
        api = new AccountApi(httpClient);

        requestOptions = RequestOptions.builder()
                                       .withCreatedBy("Something")
                                       .withReason("No Reason")
                                       .withComment("No Comment")
                                       .build();
    }

    @Test
    public void basicAccountTest() throws Exception {
        final Account account = new Account();
        final String externalKey = UUID.randomUUID().toString();
        account.setExternalKey(externalKey);
        final Account result = api.createAccount(account, requestOptions);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.getExternalKey(), externalKey);

        final UUID accountId = result.getAccountId();

        account.setEmail("somebody@something.org");
        final Account result2 = api.updateAccount(account, accountId.toString(), false, requestOptions);
        Assert.assertNotNull(result2);
        Assert.assertEquals(result2.getExternalKey(), externalKey);
        Assert.assertEquals(result2.getEmail(), "somebody@something.org");

        final Account result3 = api.getAccount(accountId.toString(), false, false, AuditLevel.FULL, requestOptions);
        Assert.assertNotNull(result3);
        Assert.assertEquals(result3.getAccountId(), accountId);
        Assert.assertEquals(result3.getExternalKey(), externalKey);
        Assert.assertEquals(result3.getEmail(), "somebody@something.org");


        api.closeAccount(accountId.toString(), false, false, false, requestOptions);

        final Account result4 = api.getAccount(accountId.toString(), false, false, AuditLevel.FULL, requestOptions);
        Assert.assertNotNull(result4);
        Assert.assertEquals(result4.getAccountId(), accountId);
        Assert.assertEquals(result4.getExternalKey(), externalKey);
        Assert.assertEquals(result4.getEmail(), "somebody@something.org");


    }



}
