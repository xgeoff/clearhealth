---
title = "Concept: Bare-Bones HSA-Compatible Health Plan"
---
Perfect — you’re describing what could actually be a **next-generation HSA-compatible, transparent-pricing plan** — something that stays within U.S. regulatory frameworks (so it’s viable) but strips away the cruft that makes normal insurance miserable. Let’s build this step by step.



## 🏗️ Concept Overview: “Bare-Bones HSA-Compatible Plan”

Let’s call this prototype **ClearHealth Basic**.

**Goal:**
A fully HSA-eligible, minimal-overhead, direct-pay plan that wraps catastrophic protection around transparent pricing (including prescriptions via Cost Plus Drugs).



## 🧮 Step 1: Regulatory Foundation — HSA Compatibility

To qualify as HSA-eligible under IRS rules, your plan must be a **High Deductible Health Plan (HDHP)** that meets all of these:

| Rule                                  | 2025 Requirement (IRS)                                        |
| ------------------------------------- | ------------------------------------------------------------- |
| **Minimum Deductible (Self-Only)**    | $1,650                                                        |
| **Minimum Deductible (Family)**       | $3,300                                                        |
| **Maximum Out-of-Pocket (Self-Only)** | $8,300                                                        |
| **Maximum Out-of-Pocket (Family)**    | $16,600                                                       |
| **No first-dollar coverage**          | Except for preventive care (per IRS Notice 2004-23 & 2004-50) |

So your plan:

* Covers **preventive care at 100%** (annual physicals, vaccines, screenings).
* Everything else (primary care, urgent care, prescriptions, imaging, etc.) is **cash-price until the deductible is met**.
* Once deductible is met → **100% coverage** or **80/20 coinsurance** up to OOP max.



## 💊 Step 2: Prescriptions — Cost Plus Integration

**Cost Plus Drugs (Mark Cuban’s company):**

* Sells generic medications at **cost + 15% + $3 pharmacy fee + $5 shipping.**
* No PBM middlemen, no formularies.

### Integration options:

1. **Direct link:** Route all prescription fills to CostPlusDrugs.com — either paid directly by the member (pre-deductible) or reimbursed after deductible.
2. **API partnership:** Pull real-time price data via Cost Plus’ APIs → show users exact out-of-pocket prices in your app.
3. **Optional concierge layer:** let members prepay meds via the plan wallet (HSA-linked debit).

**Result:**

* No opaque PBM pricing.
* HSA-eligible because all spending pre-deductible is member-paid.



## 🏥 Step 3: Provider & Network Model

Go **network-agnostic**:

* Let members use any licensed provider.
* Reimburse at a **reference rate** (e.g., 120% of Medicare).
* Encourage use of **direct primary care** or **telehealth** with transparent cash pricing.

### Example:

* Member sees Dr. Smith, who charges $120.
* Medicare rate = $100 → plan reimburses $120 once deductible met.
* Before deductible, member pays directly, ideally through HSA.

You can partner with vendors like:

* **Sesame Care** or **MDsave** for cash-priced care.
* **Telehealth APIs** (Wheel, Teladoc, SteadyMD, etc.) for virtual visits.



## 📱 Step 4: Member Experience Layer

A simple web + mobile portal:

* Tracks deductible + HSA balance.
* Integrates with Cost Plus and DPC/telehealth APIs.
* Displays transparent procedure pricing.
* Offers digital receipts for HSA reimbursement.

**Core tech stack:**

* Micronaut backend with FHIR interface.
* PostgreSQL (claims + transactions).
* Cloudflare Workers / API Gateway for routing.
* React or Flutter for app.



## 💰 Step 5: Example Plan Structure

| Feature                            | Self-Only                          | Family       |
| ---------------------------------- | ---------------------------------- | ------------ |
| **Deductible**                     | $2,000                             | $4,000       |
| **Coinsurance (after deductible)** | 0% (100% coverage)                 | 0%           |
| **OOP Max**                        | $8,000                             | $16,000      |
| **Preventive care**                | Covered 100%                       | Covered 100% |
| **Rx (via Cost Plus)**             | Member pays actual Cost Plus price | same         |
| **Telehealth visit**               | $40 flat (applied to deductible)   | same         |
| **Any doctor**                     | Yes, reimbursed 120% of Medicare   | same         |
| **HSA compatible**                 | ✅                                  | ✅            |


## 🧩 Step 6: Launch Strategy

Start as a **self-funded plan administrator** or **MGA (managing general agent)**:

1. Partner with a stop-loss reinsurer for catastrophic claims.
2. Build out the PAS + HSA integration.
3. Offer to small employers, freelancers, and LLCs tired of opaque plans.
4. Position as “**Health insurance that plays nice with your HSA — and nothing else.**”



## ✳️ Add-Ons (Optional)

* **Direct Primary Care (DPC)** membership subsidy.
* **Wellness Rebate:** HSA bonus contribution for preventive screening.
* **Transparent Imaging Add-on:** pre-negotiated MRI/CT centers at fixed prices.



Would you like me to take this to the **next step** by:

1. Drafting a **plan document outline** (the legal + regulatory template)?
2. Designing a **tech architecture** for the PAS + HSA integration?
3. Modeling **financial viability** (premiums vs. expected claims + stop-loss)?

Which direction do you want to go next?
