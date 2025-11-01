---
title = "ClearScript: Prescription Fulfillment Workflow"
---
Perfect — here’s a **member-to-medication workflow** that shows how your plan could integrate **Cost Plus Drugs** as the default channel and your own **discount fallback** for uncovered meds.



## 💊 Prescription Fulfillment Flow

### **1. Prescription Issued**

* Member visits a doctor or telehealth provider.
* The prescription is sent electronically (e-prescribed) or printed.
* Doctor uses standard e-prescribing software (e.g., Surescripts), no special setup required.



### **2. Member Portal / App Lookup**

* The member logs into your plan’s portal or app, which connects to:

    * **Cost Plus API or catalog** for transparent pricing.
    * **Your discount-card database** (or partner PBM-lite system) for alternate prices.
* The system shows two sections:

    * ✅ *“Buy from Cost Plus”* — price, shipping, estimated delivery.
    * 💳 *“Use Local Discount Pharmacy”* — participating locations and price using your card.



### **3. Decision Point**

| Scenario                              | Action                                 | Payment                                                                         | Notes                                                                  |
| ------------------------------------- | -------------------------------------- | ------------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| **Drug available on Cost Plus**       | Member orders directly online          | Member pays full Cost Plus price out of pocket (eligible for HSA reimbursement) | Order ships to home; no claim submission needed beyond record capture. |
| **Drug *not* available on Cost Plus** | Member selects local discount option   | Member shows the plan’s discount card at a participating pharmacy               | The pharmacy charges the pre-negotiated discounted cash price.         |
| **Emergency or urgent fill**          | Member uses local pharmacy immediately | Discount card accepted                                                          | Optional: plan can reimburse cost gap after claim upload.              |



### **4. Claim Capture (Optional but Valuable)**

* Even though these are “cash” transactions, the member portal records:

    * NDC (drug identifier)
    * Amount paid
    * Quantity
    * Source (Cost Plus or Discount Network)
* This data populates your **claims ledger** for:

    * Year-end reporting (for HSA use)
    * Future actuarial and utilization analytics
    * Potential reinsurance claim triggers


### **5. Catastrophic Protection**

* If a member’s total annual medication spend exceeds your catastrophic threshold (say >$5 000), your **catastrophic coverage** or **stop-loss policy** kicks in.
* The plan reimburses all further medication costs that year.
* Reinsurance can backstop this layer for predictability.



## ⚙️ System Architecture Overview

**Front end:** member portal or app
**Back end:**

* Cost Plus Drugs API integration
* Discount-network price feed (GoodRx API or your own database)
* Simple “claims-light” ledger (JSON or FHIR format) for recordkeeping
* Rules engine to trigger catastrophic reimbursements and reinsurance events


## 🪙 Example Member Experience

> *“You have a prescription for Atorvastatin 20 mg.”*
> – Cost Plus price: $3.60 + $5 shipping
> – Local price (with ReachRx card): $6.25 at CVS on Main St.
>
> **Choose delivery or pickup.**
>
> → Member chooses Cost Plus.
> → Order ships; record automatically logged to HSA ledger.
>
> Next time the drug isn’t in Cost Plus:
> → Portal shows “Use ReachRx discount” instructions and digital card barcode.


If you’d like, I can mock up the **data model** and **API flow diagram** (showing Cost Plus lookup → discount fallback → ledger record → catastrophic trigger).
Would you like that next?
