---
title = "ClearHealth from the Provider's Perspective"
---

**From the provider’s perspective**, step by step, here’s how accepting ClearHealth patients works — and why it’s so easy.


## 🏥 1. Setting the Scene: The Small Clinic Reality

Think of your average small family practice or independent clinic:

* 2–5 clinicians
* A front-desk team who do *everything* — scheduling, billing, claims
* Their billing software (Athena, Kareo, AdvancedMD, DrChrono, etc.) is built for **CPT → claim → insurer portal → wait 45 days → EOB → adjust → rebill**

They hate:

* Rejections (“payer ID missing”)
* Pre-authorizations
* Denials after 60 days
* Not knowing what they’ll actually be paid

Their dream?
➡ **Swipe a card or click “pay” and be done.**



## 🩺 2. What Happens When You Walk In With ClearHealth

Let’s say you show your **ClearHealth Member Card**.

The front desk sees:

* “ClearHealth – Reference-based HDHP”
* “Pay direct, HSA-eligible. See portal for real-time pricing.”

They have **three easy options**, depending on how modern they are.



### **Option 1 — The Modern Route (Preferred)**

✅ *Instant price + instant payment*

1. Provider logs into **ClearHealth Provider Portal** (simple web app).
2. They type the CPT code (e.g., 99213 for office visit).
3. Portal instantly shows:

    * Medicare rate: $95
    * ClearHealth reimbursement: 120% = $114
    * “Collect from patient? Pre-deductible → yes.”
4. They click “Submit” and either:

    * Charge $114 to the member’s HSA-linked card **immediately**, or
    * Send an electronic invoice (ACH/Stripe).

📅 Payment to provider: within **48 hours**.
No claim denials. No waiting. No pre-auth.



### **Option 2 — The “Cash Price” Route (Common Early On)**

✅ *Use existing workflow — no portal, no EDI*

If they already have a **cash price list**, you tell them:

> “Bill me your normal self-pay price or your Medicare rate × 1.2 — whichever is lower.
> You’ll be paid electronically within 2 business days.”

They send a PDF or itemized invoice to [claims@clearhealth.io](mailto:claims@clearhealth.io) or upload to your site.
ClearHealth processes it automatically.

📅 Payment: within 48 hours via ACH.

This fits perfectly with practices that already see uninsured or DPC patients — *you’re just another fast-paying, low-hassle patient.*



### **Option 3 — The “Old-School Claim” Route**

✅ *EDI-friendly fallback*

If they insist on using their billing system:

* You provide a **payer ID** (via clearinghouse like Eligible.io).
* They submit an 837 claim as usual.
* ClearHealth adjudicates in hours, not weeks.

📅 Payment: 3–5 days.

They don’t have to learn anything new — but you still control the experience and transparency.



## 💡 3. How They Know What to Charge

ClearHealth provides:

* A **public searchable fee schedule** (“Medicare + 20%” calculator).
* Or a **QR code on the member’s card** that opens their rate page:

  ```
  clearhealth.io/rates/99213 → shows $114 for this region
  ```

No negotiations, no mystery.
It’s *the opposite of insurance networks* — simple, published, and instant.



## ⚙️ 4. What They Need (and Don’t Need)

| Requirement              | Traditional Insurer | ClearHealth                       |
| ------------------------ | ------------------- | --------------------------------- |
| EDI 837 submission       | Required            | Optional                          |
| Payer enrollment         | Required            | Not needed                        |
| Pre-authorization        | Common              | Never (except rare inpatient)     |
| Waiting 30–90 days       | Normal              | 1–2 days                          |
| Special software         | Yes                 | No — web portal or invoice upload |
| Contract / credentialing | Mandatory           | None                              |
| Network negotiation      | Always              | Never                             |

Your **biggest differentiator**:

> “If you can send an invoice, we can pay you — fast.”



## 💰 5. The Psychology for Providers

At launch, your goal is **not** to “convince them to take ClearHealth” — it’s to **make it frictionless to accept cash** while still giving the patient insurance protection.

So you position it like this:

> “You don’t have to sign up for anything.
> Just treat ClearHealth members like cash-pay patients.
> We’ll handle the insurance part behind the scenes — and pay you faster than any carrier.”

That’s **music to their ears.**



## 🧩 6. How You Build Trust Quickly

1. **Pay fast.** Nothing builds credibility like a 2-day ACH.
2. **Be transparent.** Always show them the rate table upfront.
3. **Give them an easy portal.** Simple login → see claims → download 1099.
4. **Provide support humans.** Real contact for billing staff (not an IVR maze).
5. **Recognize good behavior.** Prompt payment bonuses or “trusted provider” badges.



## 🧠 7. The Backend Workflow Supporting This

| Step             | Process                        | Automation                        |
| ---------------- | ------------------------------ | --------------------------------- |
| Claim submission | JSON, PDF, or EDI intake       | API + OCR ingestion               |
| Validation       | NPI, CPT, ICD checks           | Automated rule engine             |
| Pricing          | Medicare + multiplier lookup   | SQL / Redis cache                 |
| Deductible check | Real-time                      | FHIR Eligibility API              |
| Payment          | HSA card or ACH                | Stripe Treasury / Modern Treasury |
| Confirmation     | Provider + member notification | Email + dashboard update          |



## 🚀 8. The Onboarding Playbook

| Phase         | Action                                               | Outcome        |
| ------------- | ---------------------------------------------------- | -------------- |
| **Month 1**   | Build 100-provider pilot list (DPC + small clinics)  | Early adopters |
| **Month 2**   | Offer instant-pay guarantee (“We pay in 48 hours”)   | Hook           |
| **Month 3**   | Launch provider referral program                     | Network growth |
| **Month 4–6** | Offer optional API integrations for billing software | Scale          |



### ✅ In short:

* No credentialing, no portals if they don’t want them, no special setup.
* They can charge their normal cash rate or check your transparent fee table.
* They get paid fast, and you handle all the backend reconciliation automatically.

