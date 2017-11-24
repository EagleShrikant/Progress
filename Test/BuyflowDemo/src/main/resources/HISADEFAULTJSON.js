{
	 "event": {
		 "eventId": "ebf195f3-6074-48dd-be3f-d645ddcaf1e8",
		 "eventType": "OrderAccepted",
		 "emailAddress": "ebonymarie0806@gmail.com",
		 "eventCategory": "ORDER_LIFECYCLE",
		 "entity": "FedOrder"
	},
	 "data": {
		 "order": {
			 "satelliteTVOnlySingleDispatchEligibleIndicator": false,
			 "orderType": "CREATE",
			 "isCommonOrder":"TRUE",
			 "addresses": {
				 "address": [
					{
						 "id": "ADDRESS_01",
						 "unparsedAddress": {
							 "zip": 0,
							 "country": "",
							 "city": "",
							 "addressLine1": "",
							 "addressLine2": "",
							 "state": ""
						},
						 "additionalDetails": {
							 "additionalDetail": [
								{
									 "code": "ValidatedAddress",
									 "value": true
								}
							]
						},
						 "parsedAddress": {
							 "zip": 0,
							 "videoHubOffice": "",
							 "streetType": "",
							 "city": "",
							 "smartMoves": "N",
							 "linkKey": "D",
							 "houseNumber": 1291,
							 "zipCodeExtension": 2045,
							 "rateCenterCode": "ATLANTA NW",
							 "tarCode": "000705",
							 "legalEntity": "5G00",
							 "rateZoneBanCode": 524,
							 "streetName": "CENTER",
							 "primaryNPANXX": 770941,
							 "clli8": "ASTLGAMA",
							 "zipGeoCode": null,
							 "state": "GA",
							 "directionPrefix": null,
							 "exchangeCode": "AUST",
							 "buildingType": "N"
						},
						 "addressId": "T100ca405c4"
					}
				]
			},
			 "chatId": 741785261056333307,
			 "totalPrice": {
				 "price": [
					{
						 "currencyType": "",
						 "total": 0,
						 "amount": 0,
						 "priceType": ""
					},
					{
						 "currencyType": "",
						 "total": 0,
						 "amount": 0,
						 "priceType": ""
					},
					{
						 "currencyType": "",
						 "total": 0,
						 "amount": 0,
						 "priceType": ""
					}
				]
			},
			 "creditPolicy": {
				 "crsmOnFlag": false
			},
			 "submittedDate": "2017-09-21T18:48:11.648+0000",
			 "salesChannel": "COR",
			 "customerOrderNumber": "22-447634948116878",
			 "termsAndConditions": {
				 "termsAndConditionAccepted": [
					{
						 "agreementType": "TOS",
						 "accepted": "N",
						 "id": "TC_01",
						 "version": 1,
						 "timestamp": "2017-09-21T08:53:09.542-05:00"
					},
					{
						 "agreementType": "MOBILE_ALERT",
						 "accepted": "N",
						 "id": "TC_02",
						 "version": 0,
						 "timestamp": "2017-09-21T13:46:38.981-05:00"
					}
				]
			},
			 "singleDispatchEligibleIndicator": true,
			 "lineItems": {
				 "lineItem": [
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": null,
								 "ignorePricePlanCode": "Y"
							},
							 "internetLineItemCharacteristics": {
								 "overageBucketAllowance": 50,
								 "bucketAllowance": 1,
								 "maxOverageCharge": 100,
								 "pricePerBucketAllowance": 10,
								 "boltOnType": "BASE"
							}
						},
						 "quantity": 1,
						 "displayName": "Includes 1TB per month",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 0
								}
							]
						},
						 "billingCode": 88548253,
						 "sequence": 1,
						 "productSKU": "sku8030287",
						 "productCode": "prod8720242",
						 "systemName": "Base-1 TB; 50 GB; $10; $100:88548253",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 0,
							 "total": 0,
							 "msrp": 0,
							 "priceType": "RC"
						},
						 "action": "ADD",
						 "id": 99684282944,
						 "productType": "INCLUDED_FEATURE",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_02",
								"GROUP_04"
							]
						}
					},
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": null,
								 "componentConfigurations": [
									{
										 "componentCode": "VOIPLINE",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "CVOIP|VOIPLINE",
										 "componentOperations": [
											{
												 "operationNames": [
													"PUSPOQtResponse"
												]
											}
										]
									},
									{
										 "componentCode": "VOIPDL",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "CVOIP|VOIPLN|VOIPDL",
										 "attributes": [
											{
												 "attributeCode": "directoryListingType",
												 "attributeOperations": [
													{
														 "operationNames": [
															"IUSPDResponse"
														]
													}
												],
												 "attributeValue": "Published"
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"IUSPDResponse"
												]
											}
										]
									}
								]
							}
						},
						 "quantity": 1,
						 "displayName": "Published phone listing",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 0
								}
							]
						},
						 "billingCode": 34189,
						 "sequence": 2,
						 "productSKU": "uv30003",
						 "productCode": "uv50006",
						 "systemName": "Published",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 0,
							 "total": 0,
							 "msrp": 0,
							 "priceType": "RC"
						},
						 "action": "ADD",
						 "id": 99684282943,
						 "productType": "OPTIONAL_FEATURE",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_01",
								"GROUP_04"
							]
						}
					},
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": "VOIPLINE",
								 "componentConfigurations": [
									{
										 "componentCode": "CVOIP",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "CVOIP",
										 "attributes": [
											{
												 "attributeCode": "usagePlan",
												 "attributeOperations": [
													{
														 "operationNames": [
															"IUSPDResponse"
														]
													}
												],
												 "attributeValue": "VPUNNA"
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"IUSPDResponse"
												]
											}
										]
									},
									{
										 "componentCode": "VOIPLINE",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "CVOIP|VOIPLINE",
										 "attributes": [
											{
												 "attributeCode": "numberOfVOIPLINE",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": 1
											},
											{
												 "attributeCode": "usagePlan",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": "VPUNNA"
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"MOORequest"
												]
											},
											{
												 "operationNames": [
													"PUSPO1Request"
												]
											}
										]
									}
								]
							}
						},
						 "quantity": 1,
						 "displayName": "AT&T Phone Unlimited North America",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 30
								}
							]
						},
						 "billingCode": 88806246,
						 "sequence": 3,
						 "productSKU": "sku7750340",
						 "productCode": "prod8430429",
						 "systemName": "PrimaryUnlimitedNorthAmerica",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 30,
							 "total": 30,
							 "msrp": 30,
							 "priceType": "RC"
						},
						 "action": "ADD",
						 "id": 99684282942,
						 "productType": "PLAN",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_01",
								"GROUP_04"
							]
						}
					},
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": null,
								 "componentConfigurations": [
									{
										 "componentCode": "HSIA",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "HSIA",
										 "attributes": [
											{
												 "attributeCode": "Speed",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": "Hsia25x5"
											},
											{
												 "attributeCode": "eDSP",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": 2
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"MOORequest"
												]
											},
											{
												 "operationNames": [
													"PUSPO1Request"
												]
											}
										]
									}
								]
							},
							 "internetLineItemCharacteristics": {
								 "planDownloadSpeed": "25 Mbps"
							}
						},
						 "quantity": 1,
						 "promotionReferences": {
							 "promotionReference": [
								"PROMOTION_2"
							]
						},
						 "displayName": "AT&T Internet 25",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 30
								}
							]
						},
						 "billingCode": 88541733,
						 "sequence": 4,
						 "productSKU": "sku8020261",
						 "productCode": "prod8690441",
						 "systemName": "NSP-Internet25Mx5",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 30,
							 "total": 30,
							 "msrp": 50,
							 "priceType": "RC"
						},
						 "action": "ADD",
						 "id": 99684282941,
						 "productType": "PLAN",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_02",
								"GROUP_04"
							]
						}
					},
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": null,
								 "componentConfigurations": [
									{
										 "componentCode": "HSIA",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "HSIA",
										 "componentOperations": [
											{
												 "operationNames": [
													"PUSPOQtResponse"
												]
											}
										]
									},
									{
										 "componentCode": "QCSRCSI",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "QCSRCSI",
										 "attributes": [
											{
												 "attributeCode": "questionCsrCsiInstallationOption",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": "Tech"
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"MOORequest"
												]
											},
											{
												 "operationNames": [
													"PUSPO1Request"
												]
											}
										]
									}
								],
								 "ignorePricePlanCode": "Y"
							}
						},
						 "quantity": 1,
						 "displayName": "Internet Installation Fee",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 49.5
								}
							]
						},
						 "billingCode": 88626153,
						 "sequence": 5,
						 "productSKU": "sku8340439",
						 "productCode": "prod9040406",
						 "systemName": "hsiaInstallWithVoipAndNoTV-Tech",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 49.5,
							 "total": 49.5,
							 "msrp": 49.5,
							 "priceType": "NRC"
						},
						 "action": "ADD",
						 "id": 99684283539,
						 "productType": "MISC_CHARGE",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_02",
								"GROUP_04"
							]
						}
					},
					{
						 "characteristics": {
							 "commonCharacteristics": {
								 "requestComponentGroup": null,
								 "componentConfigurations": [
									{
										 "componentCode": "QCSRCSI",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "QCSRCSI",
										 "attributes": [
											{
												 "attributeCode": "questionCsrCsiInstallationOption",
												 "attributeOperations": [
													{
														 "operationNames": [
															"MOORequest"
														]
													},
													{
														 "operationNames": [
															"PUSPO1Request"
														]
													}
												],
												 "attributeValue": "Tech"
											}
										],
										 "componentOperations": [
											{
												 "operationNames": [
													"MOORequest"
												]
											},
											{
												 "operationNames": [
													"PUSPO1Request"
												]
											}
										]
									},
									{
										 "componentCode": "VOIPLINE",
										 "componentMapRequiredIndicator": true,
										 "componentPath": "CVOIP|VOIPLINE",
										 "componentOperations": [
											{
												 "operationNames": [
													"PUSPOQtResponse"
												]
											}
										]
									}
								],
								 "ignorePricePlanCode": "Y"
							}
						},
						 "quantity": 1,
						 "displayName": "Phone Installation Fee - Primary Line",
						 "payments": {
							 "payment": [
								{
									 "currencyType": "USD",
									 "amount": 49.5
								}
							]
						},
						 "billingCode": 88626023,
						 "sequence": 6,
						 "productSKU": "sku8340441",
						 "productCode": "prod9040408",
						 "systemName": "voipInstallWithHsiaAndNoTV-Tech",
						 "locationId": "K006",
						 "price": {
							 "currencyType": "USD",
							 "amount": 49.5,
							 "total": 49.5,
							 "msrp": 49.5,
							 "priceType": "NRC"
						},
						 "action": "ADD",
						 "id": 99684283540,
						 "productType": "MISC_CHARGE",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_01",
								"GROUP_04"
							]
						}
					},
					{
						 "billingCode": "NOT_AVAILABLE",
						 "sequence": 7,
						 "productCode": "NOT_AVAILABLE",
						 "price": {
							 "currencyType": "USD",
							 "amount": 50,
							 "total": 50,
							 "msrp": 50,
							 "priceType": "NOT_APPLICABLE"
						},
						 "displayName": "Receive a <b>$50 reward card</b> for ordering online today ",
						 "action": "ADD",
						 "id": 17300004,
						 "productType": "REWARDS/GIFT",
						 "groupReferences": {
							 "groupReference": [
								"GROUP_03",
								"GROUP_04"
							]
						}
					}
				]
			},
			 "encryptedIndicator": true,
			 "geoAreaSingleDispatchAvailableIndicator": false,
			 "commonOrderIndicator": false,
			 "orderSource": {
				 "browserId": "A002417115586",
				 "clientType": "DESKTOP",
				 "application": "STI",
				 "channel": "INDIRECT",
				 "locale": "en_US",
				 "additionalDetails": {
					 "additionalDetail": [
						{
							 "code": "ORDER_STATUS_URL",
							 "value": "https://www.att.com/checkmyorder/processOSRequest.rt?onum=22-447634948116878&zip=30126&appid=OCE&isCRU=false&context=vnIVkehO1KnzUl%2FIwST3ma1OpL4QcL6mtK7GpMRsMsc2A1hu%2B4zhiQo1eL7FxfqhI7h%2BgNM%2FylnpF4Kn4nMA%2FijGIjbA3ztETYQfx3G54QEnqd3NynP3HDpz8i3TQVOXbdyLBBJ10d8M36aerGpP3MFrzIxeZlb2B5AaEjAdVBYyhEsZZQ0%2BpVeXRtt9a%2BgoZLC8wwIfZj7aBLurznFtncyk0p8njC%2Fa7xqePTCML9wdWIxbt67ofque7deGmAPHWsFRDY9IKFauijhJPbsPmiSBr%2Fwg6Z2dwBw8l5Pe0lg3AyQ1NZEA5hmpHuyeay9QtqspKu6vVdDQ1K0aTfTcGoD9vgpy4CcQLD8dahJZV6gxMIvjy3qhe7J3miMGJp0AX4P1szzgXXppRW%2Bt%2BhmfXACK69wa0NOeN6j1j0Y3xoXic2nf4ESWU%2Frdd4KFE%2B1atIESVCwdRm4HcPYpONI3uDVCV6OInS7Qe9b5%2BtlAp0sKh6SCy0k4t47bMxwFJX964Szo5oukUuYY21JEtcoAPyk2k1ApDzGp7k3G%2Feg8kEt2tLAS3FhZ3rrjIFtu0b4s"
						},
						{
							 "code": "SENDER",
							 "value": "STI"
						}
					]
				}
			},
			 "salesCode": "ALTAY7V",
			 "serviceFacilityQualifications": {
				 "serviceFacilityQualification": [
					{
						 "preferredNetworkType": "FTTN-BP",
						 "addressReference": "ADDRESS_01",
						 "frequency17MhzIndicator": false,
						 "facilityCheck": {
							 "serviceType": [
							],
							 "validations": [
								{
									 "code": "SC1-0000",
									 "message": "No conflicts. OK to proceed."
								}
							]
						},
						 "profileCode": "TDD033",
						 "cpeRequiredIndicator": false,
						 "id": "SERVICE_QLFY_01",
						 "vectoringIndicator": false,
						 "dslAvailableIndicator": false
					}
				]
			},
			 "salesLocation": "Default",
			 "schedulingDetails": {
				 "schedulingDetail": [
					{
						 "nameReference": "NAME_01",
						 "installType": "TECH",
						 "nFFlFlag": "FALSE",
						 "actualSchedule": {
							 "selectedAppointmentTime": "08:00:00",
							 "startTime": "08:00 AM",
							 "endTime": "12:00 PM",
							 "workOrderId": "B7264009352",
							 "selectedAppointmentDate": "2017-09-29"
						},
						 "id": "SCHEDULINGINFO_01",
						 "realTimeCalendarIndicator": true
					}
				]
			},
			 "additionalDetails": {
				 "additionalDetail": [
					{
						 "code": "INSTALLMENT_BILLING_MONTHS",
						 "value": 3
					},
					{
						 "code": "MULTI_INSTALLMENT_TERMS",
						 "type": "STKOR",
						 "value": "False"
					}
				]
			},
			 "promotions": {
				 "promotion": [
					{
						 "unitOfMeasurement": "FLATOFF",
						 "promotionType": "PROMOTION",
						 "amount": 20,
						 "effectiveInDays": 0,
						 "promotionCode": "IS0602",
						 "promotionCycle": "MONTHLY",
						 "percent": 0,
						 "promotionId": 88695713,
						 "duration": 999,
						 "complexDiscountIndicator": false,
						 "sequence": 1,
						 "promotionName": "Internet bundle discount",
						 "displayLevel": "ITEM",
						 "baseOfferId": 88541733,
						 "id": "PROMOTION_2",
						 "fixedAmount": 0
					}
				]
			},
			 "createdDate": "2017-09-21T18:48:11.648+0000",
			 "names": {
				 "name": [
					{
						 "firstName": "Linda",
						 "lastName": "shinnery",
						 "emailAddress": "ebonymarie0806@gmail.com",
						 "primaryContactPhones": [
							{
								 "phoneNumber": 8083155755,
								 "contactPhoneType": "CELL_PHONE",
								 "consentDetails": {
									 "consentDetail": [
										{
											 "consentSelection": "Opt-Out",
											 "consentType": "Both",
											 "consentCategory": "Global"
										}
									]
								}
							}
						],
						 "id": "NAME_01"
					},
					{
						 "firstName": "LM",
						 "lastName": "Shinnery",
						 "id": "NAME_02"
					}
				]
			},
			 "orderContact": {
				 "nameReference": "NAME_01",
				 "preferredContactMethod": "EMAIL",
				 "preferredTimeOfDayForContact": "",
				 "primaryEmailAddress": "ebonymarie0806@gmail.com",
				 "orderConfirmationByEmailPermissionIndicator": true
			},
			 "specialInstructions": null,
			 "agentUId": "pg534u",
			 "productGroups": {
				 "group": [
					{
						 "sequence": 1,
						 "characteristics": {
							 "losgCharacteristics": {
								 "accountReference": "ACCOUNT_01",
								 
								 "fulfillmentMethod": "DF",
								 "primaryIndicator": true,
								 "additionalDetails": {
									 "additionalDetail": [
										{
											 "code": "parentComponentCode",
											 "type": "OMRR",
											 "value": "UMC"
										}
									]
								},
								 "losgReferenceId": "voipP",
								 "productCategory": "VOIP",
								 "installationInstructions": {
									 "installationInstruction": [
										{
											 "question": "additionalJacksOrWiring",
											 "answers": "Default"
										},
										{
											 "question": "customerWillingForCSI",
											 "answers": "Default"
										},
										{
											 "question": "useExistingJacks",
											 "answers": "Default"
										}
									]
								},
								 "sequence": 1,
								 "losgType": "NEW",
								 "serviceQualificationReference": "SERVICE_QLFY_01",
								 "installType": "TECH",
								 "serviceLocationReference": "ADDRESS_01",
								 "schedulingDetailReference": "SCHEDULINGINFO_01",
								 "voipLOSCharacteristics": {
									 "directoryListing": [
										{
											 "nameReference": "NAME_02",
											 "omitAddressIndicator": false,
											 "listing": {
												 "listingType": "LISTED"
											}
										}
									]
								}
							}
						},
						 "price": [
							{
								 "currencyType": "USD",
								 "total": 0
							},
							{
								 "currencyType": "USD",
								 "total": 30,
								 "priceType": "RC"
							},
							{
								 "currencyType": "USD",
								 "total": 49.5,
								 "priceType": "NRC"
							}
						],
						 "id": "GROUP_01",
						 "type": "LINE_OF_SERVICE"
					},
					{
						 "sequence": 2,
						 "characteristics": {
							 "losgCharacteristics": {
								 "accountReference": "ACCOUNT_01",
							
								"ecommercePartner":{
							  "ecommercePartner":[{
							  	"code":"NFEHC",
							  	"type":"NSP",
							  	"name":"Costco",
							  	"affiliateName":"DSP"
							  }]
								},
								 
								 "fulfillmentMethod": "DF",
								 "additionalDetails": {
									 "additionalDetail": [
										{
											 "code": "parentComponentCode",
											 "type": "OMRR",
											 "value": "UMC"
										},
										{
											 "code": "TotalDataAllowance",
											 "value": 1024
										}
									]
								},
								 "losgReferenceId": "hsia",
								 "productCategory": "INTERNET",
								 "sequence": 2,
								 "losgType": "NEW",
								 "serviceQualificationReference": "SERVICE_QLFY_01",
								 "serviceLocationReference": "ADDRESS_01",
								 "installType": "TECH",
								 "internetLOSCharacteristics": {
									 "internetProtocolDigitalSubscriberLineAccess": "N",
									 "primaryNetworkType": "FTTN-BP"
								},
								 "schedulingDetailReference": "SCHEDULINGINFO_01"
							}
						},
						 "price": [
							{
								 "currencyType": "USD",
								 "total": 0
							},
							{
								 "currencyType": "USD",
								 "total": 30,
								 "priceType": "RC"
							},
							{
								 "currencyType": "USD",
								 "total": 49.5,
								 "priceType": "NRC"
							}
						],
						 "id": "GROUP_02",
						 "type": "LINE_OF_SERVICE"
					},
					{
						 "sequence": 3,
						 "characteristics": {
							 "losgCharacteristics": {
								 "sequence": 3,
								 "losgType": "REWARDS/GIFT",
								 "fulfillmentMethod": "DF",
								 "termsAndConditionReferences": {
									 "termsAndConditionReference": [
										"TC_02"
									]
								},
								 "losgReferenceId": 17300004,
								 "productCategory": "MISC"
							}
						},
						 "name": "Receive a <b>$50 reward card</b> for ordering online today ",
						 "id": "GROUP_03",
						 "type": "LINE_OF_SERVICE"
					},
					{
						 "sequence": 4,
						 "characteristics": {
							 "packageCharacteristics": {
								 "code": 2000043,
								 "type": "NEW",
								 "category": "OFFER"
							}
						},
						 "name": "Package",
						 "id": "GROUP_04",
						 "type": "PACKAGE"
					}
				]
			},
			 "accounts": {
				 "account": [
					{
						 "billingDeliveryPreference": "PAPER",
						 "accountSubCategory": "NEW",
						 "accountCategory": "UVERSE_ACCOUNT",
						 "cpni": true,
						 "accountSubType": "R",
						
						 "accountType": "INDIVIDUAL",
						 "billingDetail": [
							{
								 "nameReference": "NAME_01",
								 "addressReference": "ADDRESS_02",
							
								 "authentication": {
									 "securityVerification": {
										 "pin": "tE7}",
										 "securityQuestion": "What is your favorite restaurant?",
										 "securityAnswer": "k#$+QDnD>r-)v7]'"
									},
									 "lastFourOfSSN": null,
									 "dob": "4Qc~-'6-?`",
									 "ssn": "13SF7H5UM"
								}
							}
						],
						 "passCode": "tE7}",
						 "gigaPower": "N",
						 "b2bReference": "B2B_01",
						
						 
						 "sequence": 1,
						 "creditCheck": {
							 "creditClass": "LOW",
							 "singleCreditQueryWirelessIndicator": false,
							 "creditCheckRanIndicator": true,
							 "safeScanPassIndicator": false,
							 "electronicIdNumber": "U20170921722317021",
							 "creditCheckManagementTransactionId": "U20170921722317021",
							 "safeScanAlertIndicator": false
						},
						 "spokenLanguagePreference": "ENGLISH",
						 "serviceLocationReference": "ADDRESS_01",
						 "paymentArrangement": "POSTPAID",
						 "id": "ACCOUNT_01",
						 "langId": "ENGLISH",
						 "billingLanguagePreference": "ENGLISH"
					}
				]
			},
			
		}
	}
}