---
title = "Launch Blueprint for ClearHealth Basic"
---


**Phase 1 Launch Blueprint** for *ClearHealth Basic* outlines the entity structure, operational model, and early-year financial plan for a transparent, member-funded health coverage system.

## 🏗️ 1. Entity & Structural Setup

| Layer                    | Entity                                   | Purpose                                  | Notes                                                          |
| ------------------------ | ---------------------------------------- | ---------------------------------------- | -------------------------------------------------------------- |
| **Holding Co.**          | **ClearHealth LLC**                      | Owns brand, technology, and IP           | Formed as a Washington or Delaware LLC                         |
| **Health Fund**          | **ClearHealth Basic Member Pool Trust**  | Holds and disburses member contributions | Legally distinct trust or custodial account for claims funds   |
| **Administrator**        | **ClearHealth Admin Services LLC**       | Licensed TPA / service provider          | Handles enrollment, claims, eligibility, and member support    |
| **Reinsurer**            | Symetra / QBE / HM Insurance             | Provides catastrophic stop-loss coverage | Per-member or aggregate stop-loss contract                     |
| **HSA Custodian**        | Lively / HealthEquity / Fidelity         | Manages member HSAs                      | Members contribute directly; ClearHealth never holds HSA funds |
| **Bank & Trust Partner** | Cross River / Piermont / Blue Ridge Bank | Custody and claim-float management       | Provides fiduciary segregation of member funds                 |

💡 You control ClearHealth LLC and Admin Services; the member trust holds pooled funds for transparency and legal separation.

## ⚙️ 2. Operational Flow

```
Member → enrolls → pays monthly contribution
        ↓
Funds split into:
   - Member Claim Fund (≈ 80 %)
   - Admin + Stop-Loss Premium (≈ 20 %)
        ↓
Member uses telehealth / Cost Plus / direct-care providers
        ↓
If claim < $50 k → paid from Claim Fund  
If claim ≥ $50 k → Stop-Loss reimburses ClearHealth Fund  
        ↓
Year-end surplus → retained for reserves or rebated to members
```

## 💰 3. Financial Model (Year 1 Projection)

### Assumptions

* 1 000 members (average risk)
* $350 PMPM contribution
* $325 average PMPM medical + admin cost
* 10 % target reserve margin

| Category                              | PMPM                        | Annual Total |
| ------------------------------------- | --------------------------- | ------------ |
| **Member Contributions**              | $350 × 1 000 × 12 = $4.2 M  | $4 200 000   |
| **Expected Claims (80 %)**            | $280 × 1 000 × 12 = $3.36 M | $3 360 000   |
| **Stop-Loss Premium (8 %)**           | $28 × 1 000 × 12 = $336 k   | $336 000     |
| **Admin + Tech (8 %)**                | $28 × 1 000 × 12 = $336 k   | $336 000     |
| **Operating Margin / Reserves (4 %)** | ≈ $168 k                    | $168 000     |

➡ **Projected Year-1 Surplus:** ≈ $168 k (4 %) — used for marketing, reserves, or member rebates.
➡ If claims run below expected, surplus rises to 10 – 12 %.

## 🧾 4. Capital & Regulatory Requirements

| Category                      | Requirement                                          | Est. Cost     |
| ----------------------------- | ---------------------------------------------------- | ------------- |
| **Initial Capital**           | Reserve ≈ 2 months of claims + operations            | $700 k – $1 M |
| **Stop-Loss Premium Deposit** | One month upfront                                    | $25 – 50 k    |
| **Legal & Compliance**        | Trust docs, TPA filing, contracts, member agreements | $50 – 100 k   |
| **Tech MVP Build**            | Member portal + claims ledger API                    | $100 – 150 k  |

➡ **Target capital to launch:** ≈ **$1.0 – 1.3 M** (including operational float).

## ⚖️ 5. Regulatory Path

### Step 1 – Operate as a TPA (Non-insurance)

* Register ClearHealth Admin Services LLC as a Third-Party Administrator where required.
* Contract with stop-loss carriers and HSA custodians.
* Handle claims administration and member support for the ClearHealth Fund.
* No insurance license required since the fund is member-owned and fully disclosed.

### Step 2 – Member-Funded Health Pool (Non-ERISA)

* Each member joins ClearHealth Basic and contributes monthly to the shared fund.
* Funds are held in trust and used solely for eligible medical claims.
* Stop-loss coverage protects the pool against catastrophic loss.
* Members receive transparent monthly and annual statements of fund usage and reserves.
* Because coverage is individual and portable, ERISA does not apply.

### Step 3 – Captive or Health Co-op Formation (After Year 1–2)

* Once claims data and membership stabilize, form a regulated captive (Delaware, Vermont, or Hawaii).
* Captive assumes stop-loss risk and manages investment float.
* Gains long-term control of reinsurance pricing and risk capital.

## 🌱 6. Growth Model

| Phase            | Members   | Revenue         | Notes                                    |
| ---------------- | --------- | --------------- | ---------------------------------------- |
| **Pilot (6 mo)** | 100 – 250 | $100 k – $300 k | Demonstrate loss ratio < 85 %            |
| **Year 1**       | 1 000     | $4.2 M          | Add reinsurance partner                  |
| **Year 2**       | 3 000     | $12 M           | Introduce DPC & wellness add-ons         |
| **Year 3 +**     | 10 000 +  | $40 M +         | Captive conversion + multi-state filings |

## 🔐 7. Key Partnerships

| Function         | Partner Type                | Example Providers                     |
| ---------------- | --------------------------- | ------------------------------------- |
| HSA Custodian    | Bank / Fintech API          | Lively API, Fidelity HSA              |
| Reinsurance      | Stop-loss carrier           | Symetra, QBE, HM                      |
| TPA Platform     | Claims + eligibility        | Marpai, Gusto Benefits Infra          |
| Pharmacy Pricing | Transparent drug sourcing   | Cost Plus Drugs API                   |
| Telehealth       | Virtual care platform       | Wheel, SteadyMD                       |
| Payments         | ACH + ledger infrastructure | Unit, Treasury Prime, Stripe Treasury |

## 🚀 8. Next Steps for Launch

1. Form *ClearHealth LLC* and *ClearHealth Admin Services LLC*.
2. Engage an actuarial partner to model expected claims and stop-loss thresholds.
3. Secure reinsurer and bank partner for trust and premium flows.
4. Develop MVP tech stack – portal, ledger, Cost Plus API integration.
5. Launch pilot cohort (100 – 250 members) and collect claims data.
6. Analyze fund performance and optimize pricing.
7. Evaluate captive formation after proof of concept.

### Summary

**ClearHealth Basic** is a transparent, member-funded health coverage platform that pairs direct-care pricing with collective risk protection and HSA compatibility. Each member owns their participation directly — there is no employer sponsor and no ERISA plan. ClearHealth Admin Services manages operations and claims on behalf of the membership, while ClearHealth LLC maintains technology, contracts, and reinsurance relationships.
