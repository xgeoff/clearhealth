---
title = "Claims Processing Redesign"

---
Exactly right — **claims** are the single biggest friction point in the entire health insurance experience. They’re where trust breaks down, costs balloon, and member experience collapses.
If you can redesign *this* piece, your plan becomes fundamentally better.

Let’s break down how claims work today, why they’re so painful, and how *ClearHealth* could handle them differently.



## 🩺 1. How Claims Work Today (and Why It’s Terrible)

### The legacy workflow:

1. **Provider → Insurer:** Doctor submits a claim (EDI 837 file) to the insurer.
2. **Insurer → Adjudication Engine:** Automated rules check the CPT codes, ICD codes, plan benefits, network contract, and medical necessity.
3. **Provider → Payment:** Insurer pays part, denies part, sends “Explanation of Benefits” (EOB).
4. **Member → Confusion:** Member gets multiple, inconsistent bills.
5. **Appeals / Adjustments:** Provider resubmits or negotiates — months later.

**Problems:**

* The system assumes *fraud and error* by default → over-verification.
* Thousands of CPT modifiers and “bundled” billing rules.
* Network contracts and PBMs distort the true price.
* Members are billed before claims are settled.
* Providers have no idea what they’ll actually get paid.



## 🔧 2. ClearHealth’s Alternative: Simplified, Transparent Adjudication

### The key concept:

**Every claim should resolve instantly and transparently — like a credit card transaction.**

To achieve that, you replace opaque EDI + claims adjudication logic with **a transparent, rules-based engine** and **real-time pricing APIs**.


### 🔹 Core Principles

| Principle                  | Description                                                             |
| -------------------------- | ----------------------------------------------------------------------- |
| **Reference Pricing**      | Pay at a fixed multiple of Medicare (e.g., 120%). No network contracts. |
| **No EOBs**                | Members see what was billed, what’s covered, and what’s owed instantly. |
| **Open APIs**              | Use FHIR and JSON-based claims exchange, not EDI 837.                   |
| **Real-time Adjudication** | Pre-price the claim at time of service.                                 |
| **Self-service Appeals**   | Members can flag errors digitally; reviewed within 3 business days.     |
| **Fast Payments**          | ACH payments to providers within 48 hours of claim submission.          |

## 🧮 3. Example: The “Modern Claim” Lifecycle

```
1. Member visits provider (cash pay or direct bill)
2. Provider submits claim → ClearHealth API (FHIR Claim resource)
3. API validates CPT code + ICD code + NPI + timestamp
4. Pricing engine looks up Medicare rate → applies 1.2x multiplier
5. Member sees instant cost breakdown:
      Service: Office Visit (99213) - $115
      Plan Responsibility: $0 (pre-deductible)
      Member Owes: $115 (HSA-eligible)
6. Payment processed automatically (from HSA or card-on-file)
7. Provider receives ACH payment in 48 hours
8. Claim recorded → deductible & OOP balance updated
```

Result: **No waiting, no mail, no surprises.**


## ⚙️ 4. Tech Architecture for Claims

| Layer                    | Function                                     | Tools / Standards                                 |
| ------------------------ | -------------------------------------------- | ------------------------------------------------- |
| **Front-end Portal**     | Members & providers see real-time prices     | React + FHIR API calls                            |
| **Adjudication Engine**  | Determines payment amounts                   | Micronaut service using rulesets (CPT → Medicare) |
| **Reference Data Store** | CPT, DRG, ICD-10, NPI, and CMS Fee Schedules | PostgreSQL or Redis cache                         |
| **Payment Processor**    | HSA-linked debit, ACH, or Stripe Treasury    | Stripe / Treasury Prime                           |
| **Ledger + Audit**       | Immutable transaction log for DOL compliance | Postgres + Cloudflare R2 backups                  |
| **Analytics Layer**      | Cost transparency + reporting                | BigQuery / DuckDB + Metabase                      |


## 📜 5. Handling Providers Without EDI

Providers don’t need to use EDI if you:

* Provide a **web dashboard** for uploading invoices.
* Accept **PDF or JSON claim forms** → OCR or structured upload.
* Automatically generate CMS-1500 claim forms for compliance.
* Return **instant adjudication + ACH payment**.

You can still maintain a legacy EDI gateway for compatibility (via Change Healthcare or Eligible.io), but it’s optional.


## 🧠 6. AI/LLM Role in Claims Simplification

AI can be leveraged responsibly in three areas:

1. **Code Validation:** Detect mismatched or redundant CPT/ICD codes.
2. **Duplicate Detection:** Spot repeated services for same member/date.
3. **Language Simplification:** Translate claim/EOB details into plain English for members.

> Example:
> “Your doctor billed $115 for a standard office visit. This counts toward your deductible. You owe $115, which can be paid from your HSA.”


## 💵 7. Claims Transparency = Cost Control

A transparent, reference-based system means:

* Providers bill what’s reasonable (since they know the reference rate).
* Members see the true cost → behavioral pressure to choose value.
* No need for prior authorizations for most outpatient services.
* Drastically reduced administrative overhead (~50% less than legacy insurers).


## 🧩 8. Third-Party Integrations You Could Use

| Function                  | Vendor                                                |
| ------------------------- | ----------------------------------------------------- |
| **Claims intake API**     | Eligible.io, PokitDok (legacy), or Noyo               |
| **CMS rate data**         | Redbook, CMS API, Fair Health, OpenMRS                |
| **Payment orchestration** | Unit Finance, Modern Treasury, or Stripe Treasury     |
| **FHIR schema**           | Google Cloud Healthcare API, Firely Server, HAPI FHIR |
| **Automation / Rules**    | Camunda, Drools, or custom Kotlin DSL in Micronaut    |


## 🧭 9. The Business Win

If traditional insurers spend 15–20% of premium on admin and claims processing (the “medical loss ratio” admin load), you can do it for 4–6% — while delivering faster payments and total price transparency.

That difference alone is your margin advantage.


Would you like me to **sketch the actual architecture diagram** for ClearHealth’s claims engine — showing API flow, pricing lookup, and payment integration (FHIR-based, Micronaut-powered)?
