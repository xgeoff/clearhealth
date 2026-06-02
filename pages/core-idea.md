---
title = "Core Idea: Program Reinsurance and Member OOP Protection"
---
# Core Idea: Program Reinsurance and Member OOP Protection

## 🧱 1. The Core Idea

There are two separate protections in the model, and they serve different audiences:

| Protection | Who it protects | What it does |
| ---------- | --------------- | ------------ |
| **Out-of-pocket maximum** | Member | Caps the member's covered expense exposure in a plan year. |
| **Stop-loss / reinsurance** | Program / fund | Reimburses the plan after large claims so the program stays solvent. |

The member-facing protection is the plan's maximum out-of-pocket limit. Stop-loss is a program-level financing tool. It is good for members because it keeps the program viable, but it does not pay the member directly.

Since ClearHealth is an HSA-compatible, potentially self-funded product, **stop-loss reinsurance** is the key program-protection layer.



## 🛡️ 2. Stop-Loss Reinsurance Basics

A **stop-loss policy** reimburses your plan (not the member) once claims exceed a certain threshold.

### Two primary layers:

| Type                      | Description                                           | Example                                        |
| ------------------------- | ----------------------------------------------------- | ---------------------------------------------- |
| **Specific (individual)** | Protects the program from one person’s huge medical claim | Reimburses the plan for claims above $50,000     |
| **Aggregate (group)**     | Protects the program from overall claims volatility            | Reimburses the plan if total annual claims > 125% of expected |

So your plan — whether you’re the sponsor or an administrator — pays normal claims up to the attachment point. Once someone crosses that line, the reinsurer covers the rest.



### Example Flow:

Let’s say:

* You have 500 covered members.
* Expected claims: $2,000,000 for the year.
* Specific stop-loss attachment: $50,000 per person.
* Aggregate stop-loss attachment: 125% of expected ($2.5M).

#### Scenario:

* Member A has $200,000 in hospital bills.

    * Plan pays first $50,000.
    * Reinsurer reimburses the next $150,000.
* Total group claims hit $2.6M.

    * Aggregate reinsurance reimburses the $100,000 above the $2.5M threshold.

This prevents financial ruin for a small plan. The member's protection still comes from the plan design: deductible, covered benefits, and maximum out-of-pocket limit.



## 🧩 3. Who Provides It

Stop-loss carriers and reinsurers specialize in this market:

| Type                 | Example Companies                                             |
| -------------------- | ------------------------------------------------------------- |
| Traditional carriers | Sun Life, HCC, Symetra, Swiss Re, QBE, HM Insurance           |
| New entrants         | ParetoHealth, Voya, AccuRisk, Amwins                          |
| Captive pools        | Roundstone, Stealth, Pareto Captive (for groups 50–500 lives) |

They underwrite based on:

* Group size and demographics.
* Historical or expected claims (if available).
* Plan design (deductibles, OOP max, etc.).
* Network/pricing efficiency (e.g., reference-based plans get favorable rates).



## ⚙️ 4. How It Works Operationally

1. **You create the plan** — say, ClearHealth Basic with $2,000 deductible and $8,000 OOP max.
2. **You (or an employer) act as the plan sponsor** — paying claims directly or through a TPA.
3. **You buy stop-loss coverage** from a reinsurer.

    * Premium is typically **$80–$150 per member per month** for good-risk groups.
4. **Claims process:**

    * Claims < $50k → paid normally.
    * Claims > $50k → filed to stop-loss carrier for reimbursement.
    * Claims reconciled monthly or quarterly.



## 📈 5. Why It’s Perfect for a Transparent Plan

A reinsurance structure allows the program to:

* **Operate lean** (you’re not a fully licensed insurer).
* **Keep premiums lower**, since you only fund the expected claims + admin + stop-loss premium.
* **Stay viable after large claims**, while the plan's OOP maximum limits member exposure.
* **Be flexible with innovation** — Cost Plus, DPC, reference pricing, etc. — while keeping the program financially protected.

This is the model used by **many startup “health plans”** like Decent, Sidecar, or Taro Health:
they’re technically *administrators* for a self-funded plan with stop-loss coverage layered behind it.



## 🧮 6. Typical Financial Structure

| Component                | Who Pays            | Description                                |
| ------------------------ | ------------------- | ------------------------------------------ |
| **Member Premium**       | Individual/employer | Goes into plan’s claim fund                |
| **Claim Fund**           | Plan                | Pays small/medium claims                   |
| **Admin Fee**            | Plan                | Pays TPA, app, compliance costs            |
| **Stop-Loss Premium**    | Plan                | Pays reinsurer for program-level catastrophic protection |
| **Reinsurance Recovery** | Reinsurer → Plan    | Reimburses catastrophic claims             |

You could also structure **risk corridors** (e.g., reinsurer shares 50/50 between $50k–$150k, then 100% above).



## 🧠 7. Example for ClearHealth Basic

* **Plan sponsor:** ClearHealth Cooperative (self-funded pool).
* **Third-Party Administrator (TPA):** ClearHealth Admin Platform.
* **Stop-loss reinsurer:** Symetra or QBE.
* **Specific attachment:** $50,000 per member.
* **Aggregate attachment:** 125% of expected claims.
* **Admin + stop-loss premium:** approximately $130 per member per month total.
* **Member deductible:** $2,000.
* **Plan pays 100% after deductible.**



## ⚙️ 8. Implementation Options

You could launch in three stages:

| Phase       | Structure                                                                                 | Goal                                                    |
| ----------- | ----------------------------------------------------------------------------------------- | ------------------------------------------------------- |
| **Phase 1** | Partner with an existing TPA and reinsurer to create a self-funded group plan.            | Fastest path to market.                                 |
| **Phase 2** | Form a **Captive** (self-funded consortium) to pool multiple small groups or freelancers. | Shared risk / lower reinsurance cost.                   |
| **Phase 3** | Apply for a limited-scope insurance license or MGU status.                                | Enables broader underwriting and state-level expansion. |



## 🔍 9. Visual Summary

```
Member → HSA / Direct Pay → Provider
                      ↓
               Claim Submitted
                      ↓
        Plan/TPA pays up to $50,000
                      ↓
        Stop-Loss Reinsurer reimburses
                      ↓
              Plan stays solvent
```
