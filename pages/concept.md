---
title = "Concept: Bare-Bones HSA-Compatible Health Plan"
---


## 🏗️ Concept Overview: “Bare-Bones HSA-Compatible Plan”

Let’s call this prototype **ClearHealth Basic**.

**Goal:**
A portable, fully HSA-eligible, minimal-overhead, direct-pay plan that wraps catastrophic protection around transparent pricing (including prescriptions via Cost Plus Drugs).

This is the key premise: ClearHealth is not supposed to be another employer-owned benefits product. It is coverage built around the member, with an HSA that the member owns and can keep across jobs, employers, and life changes.

## 🧭 The Four Pillars

| Pillar | Why it matters |
| ------ | -------------- |
| **Portable coverage** | The plan is designed to follow the member, not the employer. A job change should not reset the healthcare relationship. |
| **HSA-first funding** | Eligible members can use pre-tax HSA dollars for routine care. Employers can contribute to the HSA without owning the whole coverage relationship. |
| **High-deductible protection** | Routine care stays transparent and cash-priced; serious claims are backed by the plan and stop-loss protection. |
| **Reference-based pricing** | Providers bill the posted cash price or a published reference rate such as 120% of Medicare, whichever is lower. |

## 🧮 Step 1: Regulatory Foundation — HSA Compatibility

To qualify as HSA-eligible under IRS rules, your plan must be a **High Deductible Health Plan (HDHP)** that meets all of these:

| Rule                                  | 2026 Requirement (IRS)                                        |
| ------------------------------------- | ------------------------------------------------------------- |
| **Minimum Deductible (Self-Only)**    | $1,700                                                        |
| **Minimum Deductible (Family)**       | $3,400                                                        |
| **Maximum Out-of-Pocket (Self-Only)** | $8,500                                                        |
| **Maximum Out-of-Pocket (Family)**    | $17,000                                                       |
| **No first-dollar coverage**          | Except for preventive care (per IRS Notice 2004-23 & 2004-50) |

So your plan:

* Covers **preventive care at 100%** (annual physicals, vaccines, screenings).
* Everything else (primary care, urgent care, prescriptions, imaging, etc.) is **cash-price until the deductible is met**.
* Once deductible is met → **100% coverage** or **80/20 coinsurance** up to OOP max.
* Pairs with a member-owned HSA. Eligible members can contribute directly, and employers can contribute where allowed under IRS rules.

That HSA portability is central. If a member changes employers, starts a company, leaves a job, or decides COBRA is too expensive, the healthcare savings strategy does not have to start over.



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
* Shows who funded the HSA: member contribution, employer contribution, or both.
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
| **Employer-tied**                  | No                                 | No           |


## 🧩 Step 6: Launch Strategy

Start as a **self-funded plan administrator** or **MGA (managing general agent)**:

1. Partner with a stop-loss reinsurer for catastrophic claims.
2. Build out the PAS + HSA integration.
3. Offer to independent workers, families, small employers, freelancers, LLCs, and people facing COBRA or employer-plan disruption.
4. Position as “**Portable health insurance that plays nice with your HSA.**”



## ✳️ Add-Ons (Optional)

* **Direct Primary Care (DPC)** membership subsidy.
* **Wellness Rebate:** HSA bonus contribution for preventive screening.
* **Transparent Imaging Add-on:** pre-negotiated MRI/CT centers at fixed prices.

