import React from "react";
import { useState } from "react";

const Form = () => {
  const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);
  const [firstName, setFirstName] = useState("");
  const [firstNameError, setFirstNameError] = useState(null);
  const [lastName, setLastName] = useState("");
  const [lastNameError, setLastNameError] = useState(null);
  const [email, setEmail] = useState("");
  const [emailError, setEmailError] = useState(null);
  const [password, setPassword] = useState("");
  const [passwordError, setPasswordError] = useState(null);

  const submitHandler = (e) => {
    e.preventDefault();
    setHasBeenSubmitted(true);
  };

  const firstNameHandler = (e) => {
    setFirstName(e.target.value);
    if (firstName.length < 2) {
      setFirstNameError("First Name Must Be At Least  2 Characters Long ");
    } else {
      setFirstNameError(null);
    }
  };

  const lastNameHandler = (e) => {
    setLastName(e.target.value);
    if (lastName.length < 2) {
      setLastNameError("Last Name Must Be At Least  2 Characters Long ");
    } else {
      setLastNameError(null);
    }
  };

  const emailHandler = (e) => {
    setEmail(e.target.value);
    if (email.length < 2) {
      setEmailError("Email Must Be At Least  2 Characters Long ");
    } else {
      setEmailError(null);
    }
  };

  const passwordHandler = (e) => {
    setPassword(e.target.value);
    if (password.length < 7) {
      setPasswordError("Password Must Be At Least  8 Characters Long ");
    } else {
      setPasswordError(null);
    }
  };

  return (
    <div className="card mt-3">
      <div className="card-body">
        <h4 className="card-title">
          {hasBeenSubmitted
            ? "Thank you ofr submitting the form."
            : "Please enter the info"}
        </h4>
        <form onSubmit={submitHandler}>
          <div className="mb-3">
            <label htmlFor="firstName" className="form-label">
              First Name:
            </label>
            <input
              type="text"
              name="firstName "
              id="firstName"
              className="form-control"
              value={firstName}
              onChange={firstNameHandler}
            />
            {firstNameError && (
              <span className="form-text text-danger">{firstNameError}</span>
            )}
          </div>
          <div className="mb-3">
            <label htmlFor="lastName" className="form-label">
              last Name:
            </label>
            <input
              type="text"
              name="lasName "
              id="lastName"
              className="form-control"
              value={lastName}
              onChange={lastNameHandler}
            />
            {lastNameError && (
              <span className="form-text text-danger">{lastNameError}</span>
            )}
          </div>
          <div className="mb-3">
            <label htmlFor="email" className="form-label">
              Email:
            </label>
            <input
              type="email"
              name="email "
              id="email"
              className="form-control"
              value={email}
              onChange={emailHandler}
            />
            {emailError && (
              <span className="form-text text-danger">{emailError}</span>
            )}
          </div>
          <div className="mb-3">
            <label htmlFor="password" className="form-label">
              Password:
            </label>
            <input
              type="text"
              name="password "
              id="password"
              className="form-control"
              value={password}
              onChange={passwordHandler}
            />
            {passwordError && (
              <span className="form-text text-danger">{passwordError}</span>
            )}
          </div>
          <div className="mb-3">
            <label htmlFor="confirmPassword" className="form-label">
              Confirm Password:
            </label>
            <input
              type="text"
              name="confirmPassword "
              id="confirmPassword"
              className="form-control"
            />
          </div>
          <div className="d-flex justify-content-end">
            <button type="submit" className="btn btn-success">
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default Form;
